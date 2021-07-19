package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanTopsScrapper extends HMScrapper {
    public HMWomanTopsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/tops.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
