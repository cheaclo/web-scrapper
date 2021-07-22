package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanJacketsAndOvershirtsScrapper extends MangoScrapper {
    public MangoWomanJacketsAndOvershirtsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-jackets-and-overshirts_d19203156";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS);
    }
}
