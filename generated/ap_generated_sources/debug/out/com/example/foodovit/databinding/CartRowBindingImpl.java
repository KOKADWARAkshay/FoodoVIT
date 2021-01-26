package com.example.foodovit.databinding;
import com.example.foodovit.R;
import com.example.foodovit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CartRowBindingImpl extends CartRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.deleteProductButton, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CartRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CartRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Spinner) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.productImageView.setTag(null);
        this.productNameTextView.setTag(null);
        this.productTotalPriceTextView.setTag(null);
        this.quantitySpinner.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.cartItem == variableId) {
            setCartItem((com.example.foodovit.models.CartItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartItem(@Nullable com.example.foodovit.models.CartItem CartItem) {
        this.mCartItem = CartItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cartItem);
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
        com.example.foodovit.models.Product cartItemProduct = null;
        double cartItemProductPrice = 0.0;
        java.lang.String cartItemProductName = null;
        com.example.foodovit.models.CartItem cartItem = mCartItem;
        java.lang.String cartItemProductImageUrl = null;
        java.lang.String stringValueOfCartItemProductPriceCartItemQuantity = null;
        double cartItemProductPriceCartItemQuantity = 0.0;
        int cartItemQuantity = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (cartItem != null) {
                    // read cartItem.product
                    cartItemProduct = cartItem.getProduct();
                    // read cartItem.quantity
                    cartItemQuantity = cartItem.getQuantity();
                }


                if (cartItemProduct != null) {
                    // read cartItem.product.price
                    cartItemProductPrice = cartItemProduct.getPrice();
                    // read cartItem.product.name
                    cartItemProductName = cartItemProduct.getName();
                    // read cartItem.product.imageUrl
                    cartItemProductImageUrl = cartItemProduct.getImageUrl();
                }


                // read (cartItem.product.price) * (cartItem.quantity)
                cartItemProductPriceCartItemQuantity = (cartItemProductPrice) * (cartItemQuantity);


                // read String.valueOf((cartItem.product.price) * (cartItem.quantity))
                stringValueOfCartItemProductPriceCartItemQuantity = java.lang.String.valueOf(cartItemProductPriceCartItemQuantity);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foodovit.models.Product.loadImage(this.productImageView, cartItemProductImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productNameTextView, cartItemProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productTotalPriceTextView, stringValueOfCartItemProductPriceCartItemQuantity);
            com.example.foodovit.models.CartItem.getSelectedSpinnerValue(this.quantitySpinner, cartItemQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cartItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}