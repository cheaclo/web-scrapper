package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexHoodiesAndSweatshirtsScrapper extends HMScrapper {
    public HMUnisexHoodiesAndSweatshirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/hoodies-sweatshirts.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
