package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanMoreAccessoriesScrapper extends MangoScrapper {
    public MangoWomanMoreAccessoriesScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-more-accessories_d89596274";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
