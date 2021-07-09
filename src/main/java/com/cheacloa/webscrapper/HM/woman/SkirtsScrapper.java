package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.Scrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SkirtsScrapper extends Scrapper {
    public SkirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/skirts.html";
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SKIRTS_AND_SHORTS);
    }
}
