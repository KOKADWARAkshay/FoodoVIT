package com.example.foodovit.databinding;
import com.example.foodovit.R;
import com.example.foodovit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ShopRowBindingImpl extends ShopRowBinding implements com.example.foodovit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShopRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ShopRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.addToCartButton.setTag(null);
        this.availableTextView.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.priceTextView.setTag(null);
        this.productImageView.setTag(null);
        this.productNameTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.foodovit.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.foodovit.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.example.foodovit.models.Product) variable);
        }
        else if (BR.shopInterface == variableId) {
            setShopInterface((com.example.foodovit.adapters.ShopListAdapter.ShopInterface) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.example.foodovit.models.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }
    public void setShopInterface(@Nullable com.example.foodovit.adapters.ShopListAdapter.ShopInterface ShopInterface) {
        this.mShopInterface = ShopInterface;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shopInterface);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String javaLangStringStringValueOfProductPrice = null;
        java.lang.String productName = null;
        java.lang.String productAvailableJavaLangStringAvailableJavaLangStringUnavailable = null;
        java.lang.String productImageUrl = null;
        com.example.foodovit.models.Product product = mProduct;
        com.example.foodovit.adapters.ShopListAdapter.ShopInterface shopInterface = mShopInterface;
        boolean productAvailable = false;
        double productPrice = 0.0;
        int productAvailableAvailableTextViewAndroidColorTextSecondaryAvailableTextViewAndroidColorRed = 0;
        java.lang.String stringValueOfProductPrice = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (product != null) {
                    // read product.name
                    productName = product.getName();
                    // read product.imageUrl
                    productImageUrl = product.getImageUrl();
                    // read product.available
                    productAvailable = product.isAvailable();
                    // read product.price
                    productPrice = product.getPrice();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(productAvailable) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read product.available ? "Available" : "Unavailable"
                productAvailableJavaLangStringAvailableJavaLangStringUnavailable = ((productAvailable) ? ("Available") : ("Unavailable"));
                // read product.available ? @android:color/textSecondary : @android:color/red
                productAvailableAvailableTextViewAndroidColorTextSecondaryAvailableTextViewAndroidColorRed = ((productAvailable) ? (getColorFromResource(availableTextView, R.color.textSecondary)) : (getColorFromResource(availableTextView, R.color.red)));
                // read String.valueOf(product.price)
                stringValueOfProductPrice = java.lang.String.valueOf(productPrice);


                // read (" ₹") + (String.valueOf(product.price))
                javaLangStringStringValueOfProductPrice = (" ₹") + (stringValueOfProductPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.addToCartButton.setEnabled(productAvailable);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.availableTextView, productAvailableJavaLangStringAvailableJavaLangStringUnavailable);
            this.availableTextView.setTextColor(productAvailableAvailableTextViewAndroidColorTextSecondaryAvailableTextViewAndroidColorRed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.priceTextView, javaLangStringStringValueOfProductPrice);
            com.example.foodovit.models.Product.loadImage(this.productImageView, productImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productNameTextView, productName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addToCartButton.setOnClickListener(mCallback2);
            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // product
                com.example.foodovit.models.Product product = mProduct;
                // shopInterface
                com.example.foodovit.adapters.ShopListAdapter.ShopInterface shopInterface = mShopInterface;
                // shopInterface != null
                boolean shopInterfaceJavaLangObjectNull = false;



                shopInterfaceJavaLangObjectNull = (shopInterface) != (null);
                if (shopInterfaceJavaLangObjectNull) {



                    shopInterface.onItemClick(product);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // product
                com.example.foodovit.models.Product product = mProduct;
                // shopInterface
                com.example.foodovit.adapters.ShopListAdapter.ShopInterface shopInterface = mShopInterface;
                // shopInterface != null
                boolean shopInterfaceJavaLangObjectNull = false;



                shopInterfaceJavaLangObjectNull = (shopInterface) != (null);
                if (shopInterfaceJavaLangObjectNull) {



                    shopInterface.addItem(product);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): shopInterface
        flag 2 (0x3L): null
        flag 3 (0x4L): product.available ? "Available" : "Unavailable"
        flag 4 (0x5L): product.available ? "Available" : "Unavailable"
        flag 5 (0x6L): product.available ? @android:color/textSecondary : @android:color/red
        flag 6 (0x7L): product.available ? @android:color/textSecondary : @android:color/red
    flag mapping end*/
    //end
}