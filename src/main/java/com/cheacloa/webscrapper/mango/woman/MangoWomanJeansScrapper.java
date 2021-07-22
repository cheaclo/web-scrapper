package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanJeansScrapper extends MangoScrapper {
    public MangoWomanJeansScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-jeans_d12440658";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.JEANS);
    }
}
