package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanNightwearAndLoungewearScrapper extends HMScrapper {
    public HMWomanNightwearAndLoungewearScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/nightwear.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
