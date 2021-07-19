package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexJacketsAndCoatsScrapper extends HMScrapper {
    public HMUnisexJacketsAndCoatsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/jackets-and-blazers.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS);
    }
}
