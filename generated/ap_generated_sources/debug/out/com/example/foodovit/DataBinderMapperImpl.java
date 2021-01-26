package com.example.foodovit;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.foodovit.databinding.CartRowBindingImpl;
import com.example.foodovit.databinding.FragmentProductDetailBindingImpl;
import com.example.foodovit.databinding.ShopRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CARTROW = 1;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 2;

  private static final int LAYOUT_SHOPROW = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodovit.R.layout.cart_row, LAYOUT_CARTROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodovit.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodovit.R.layout.shop_row, LAYOUT_SHOPROW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CARTROW: {
          if ("layout/cart_row_0".equals(tag)) {
            return new CartRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cart_row is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_SHOPROW: {
          if ("layout/shop_row_0".equals(tag)) {
            return new ShopRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for shop_row is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "cartItem");
      sKeys.put(2, "product");
      sKeys.put(3, "shopInterface");
      sKeys.put(4, "shopViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/cart_row_0", com.example.foodovit.R.layout.cart_row);
      sKeys.put("layout/fragment_product_detail_0", com.example.foodovit.R.layout.fragment_product_detail);
      sKeys.put("layout/shop_row_0", com.example.foodovit.R.layout.shop_row);
    }
  }
}
