package com.example.foodovit.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.foodovit.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Tandoori Chicken", 130, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/tandoori%20Chicken%20Half.jpg?alt=media&token=6ec5469d-2097-4fcf-821a-2feb1022d950" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Veg Noodles", 80, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Veg%20Noodles.jpg?alt=media&token=f2fb1cd5-cf97-4673-a150-9ae69bc2f53e"));
        productList.add(new Product(UUID.randomUUID().toString(), "Veg Fried Rice", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Veg%20Fried%20Rice.jpg?alt=media&token=98cd042b-c38f-4e88-8145-ed778b67266b"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tandoori Chicken ", 80, false, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Tandoori%20Chicken%20Quarter.jpg?alt=media&token=870ab4bc-b869-4431-9269-7b0dd9faac0a"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tandoori Chicken Full", 70, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Tandoori%20Chicken%20Full.jpg?alt=media&token=dbbf3f71-dfdc-4153-bbae-0f2efbc40e86"));
        productList.add(new Product(UUID.randomUUID().toString(), "Schezwan Chic Rice", 90, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Schezwan%20Chicken%20Rice.jpg?alt=media&token=8b78b2dc-5471-4bce-a0ea-c821e3181dc1"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Noodles", 110, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Schezwan%20Chicken%20Noodles.jpg?alt=media&token=1515b67f-793a-4024-b993-2462306bbab6"));
        productList.add(new Product(UUID.randomUUID().toString(), "Plain Omelette", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Plain%20Omelette.jpg?alt=media&token=472adba6-2a11-459c-89fa-5ac22e2c07b6"));
        productList.add(new Product(UUID.randomUUID().toString(), "Plain Naan", 120, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Plain%20Naan.jpg?alt=media&token=66c2d7df-4270-4e9e-bf57-c13a4edad0d1"));
        productList.add(new Product(UUID.randomUUID().toString(), "Pepper Chicken ", 140, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Pepper%20Chicken%20Masala.jpg?alt=media&token=86908e7e-2714-4007-9222-b3e6087b16e8"));

        productList.add(new Product(UUID.randomUUID().toString(), "Paneer Tikka", 90, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Paneer%20Tikka.jpg?alt=media&token=02a10fc5-d674-4523-a06e-c5d400aa45b6"));
        productList.add(new Product(UUID.randomUUID().toString(), "Paneer Tikka Masala", 110, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Paneer%20Tikka%20Masala.jpg?alt=media&token=f7c9d957-7404-446e-ab21-5cb7d6429dc1"));
        productList.add(new Product(UUID.randomUUID().toString(), "Paneer Butter Masala", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Paneer%20Butter%20Masala.jpg?alt=media&token=97b2e636-8c76-4c9c-92bf-8c38cf4e437f"));
        productList.add(new Product(UUID.randomUUID().toString(), "Murg Malai Kebab", 120, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Murg%20Malai%20Kebab.jpg?alt=media&token=55783ef2-b133-4a66-9f25-342082e6ada0"));
        productList.add(new Product(UUID.randomUUID().toString(), "Lemon Chicken", 140, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Lemon%20Chicken.jpg?alt=media&token=cf9ef722-e525-4f25-be51-a98f6b847265"));

        productList.add(new Product(UUID.randomUUID().toString(), "Kadai Paneer", 130, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Kadai%20Paneer.jpg?alt=media&token=c6deaea1-16e6-45b4-852e-eeb1ac54c404" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Kadai Chicken Masala", 80, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Kadai%20Chicken%20Masala.jpg?alt=media&token=1d696e59-9d34-41e9-9932-3f1bf352031b"));
        productList.add(new Product(UUID.randomUUID().toString(), "Honey Chilli Chicken", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Honey%20Chilli%20Chicken.jpg?alt=media&token=f0c72e41-b1b4-4b10-9191-c25da263f2fc"));
        productList.add(new Product(UUID.randomUUID().toString(), "Egg Noodles", 80, false, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Egg%20Noodles.jpg?alt=media&token=4f231dad-7c5b-4c8c-bcfe-b856b8e6b396"));
        productList.add(new Product(UUID.randomUUID().toString(), "Egg Fried Rice", 70, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Egg%20Fried%20Rice.jpg?alt=media&token=dfcc2760-359e-45a3-ba34-abb73ded99cb"));
        productList.add(new Product(UUID.randomUUID().toString(), "Dragon Paneer", 90, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Dragon%20Paneer.jpg?alt=media&token=f26aff53-ef64-4fe6-a01e-b84b457c7849"));
        productList.add(new Product(UUID.randomUUID().toString(), "Dragon Chicken", 110, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Dragon%20Chicken.jpg?alt=media&token=4943e1ce-a9ad-4fa4-8b94-c7b0a4a407b2"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chilli Paneer", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chilli%20Paneer.jpg?alt=media&token=fe209705-67a8-4e41-9002-643e31743baa"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Tikka", 120, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Tikka.jpg?alt=media&token=fb376dcf-7756-478f-8a8b-13af76c2b193"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Tikka Masala", 140, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Tikka%20Masala.jpg?alt=media&token=1367e42a-684d-46de-9c60-49221511c260"));

        productList.add(new Product(UUID.randomUUID().toString(), "Reshmi Kebab", 90, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Reshmi%20Kebab.jpg?alt=media&token=edd138a7-dd06-4685-9787-d4a9fbf9170b"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Noodles", 110, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Noodles.jpg?alt=media&token=1ad13c0c-8a26-4743-ae69-98414f1f06cb"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Manchurian", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Manchurian.jpg?alt=media&token=54ec6b8f-3934-4389-b60d-8f2028c5d9a8"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Lollipop", 120, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Lollipop.jpg?alt=media&token=8a6c7cb0-5086-4dd8-b8a2-6f83ec39fd50"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Hariyali Kebab", 140, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Hariyali%20Kebab.jpg?alt=media&token=69ae43ca-6272-4e50-a761-5c976bad7473"));

        productList.add(new Product(UUID.randomUUID().toString(), "Chicken Fried Rice", 130, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Fried%20Rice.jpg?alt=media&token=5cb62189-4887-4657-8dff-ad33e0352f3d" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Chi Butt Masala", 80, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%20Butter%20Masala.jpg?alt=media&token=92384e28-909f-4daf-a01d-78a5b43bc838"));
        productList.add(new Product(UUID.randomUUID().toString(), "Chicken 65", 100, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Chicken%2065.jpg?alt=media&token=36b94ca6-b070-48e5-9ea5-1c7840be8b3a"));
        productList.add(new Product(UUID.randomUUID().toString(), "Butter Naan", 80, false, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Butter%20Naan.jpg?alt=media&token=a5fbd292-f790-44f5-bde6-50f437f29998"));
        productList.add(new Product(UUID.randomUUID().toString(), "Bread Omelette", 70, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Bread%20Omelette.jpg?alt=media&token=4651f5fa-3e38-4fe4-91a9-8406d727b9c3"));
        productList.add(new Product(UUID.randomUUID().toString(), "Boiled Egg", 90, true, "https://firebasestorage.googleapis.com/v0/b/foodovit-7073f.appspot.com/o/Boiled%20Egg.jpg?alt=media&token=b4eedd81-9912-4ab8-8846-6210bd2b8dd2"));



        mutableProductList.setValue(productList);
    }
}
