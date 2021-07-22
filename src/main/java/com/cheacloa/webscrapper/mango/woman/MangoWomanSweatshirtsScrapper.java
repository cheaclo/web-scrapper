package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanSweatshirtsScrapper extends MangoScrapper {
    public MangoWomanSweatshirtsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-sweatshirts_d19811909";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
