package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanTrendsScrapper extends HMScrapper {
    public HMWomanTrendsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/trend.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.TRENDS);
    }
}