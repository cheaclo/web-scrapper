package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanShoesScrapper extends HMScrapper {
    public HMWomanShoesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/shoes.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SHOES);
    }
}
