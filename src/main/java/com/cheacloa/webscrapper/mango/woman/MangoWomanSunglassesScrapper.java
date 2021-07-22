package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanSunglassesScrapper extends MangoScrapper {
    public MangoWomanSunglassesScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-sunglasses_d46726823";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
