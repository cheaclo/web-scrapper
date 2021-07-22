package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanCoatsScrapper extends MangoScrapper {
    public MangoWomanCoatsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-coats_d21376510";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS);
    }
}
