package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanScarvesScrapper extends MangoScrapper {
    public MangoWomanScarvesScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-scarves_d90768643";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
