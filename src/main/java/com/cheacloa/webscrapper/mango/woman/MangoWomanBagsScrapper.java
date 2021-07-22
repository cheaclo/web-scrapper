package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanBagsScrapper extends MangoScrapper {
    public MangoWomanBagsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-bags_d42920851";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
