package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexHoodiesAndSweatshirtsScrapper extends HMScrapper {
    public HMUnisexHoodiesAndSweatshirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/hoodies-sweatshirts.html";
        shop = Shop.HM;
        type = ProductType.UNISEX;
        categories = Arrays.asList(ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
