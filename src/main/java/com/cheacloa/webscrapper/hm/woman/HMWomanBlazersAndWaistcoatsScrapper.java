package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanBlazersAndWaistcoatsScrapper extends HMScrapper {
    public HMWomanBlazersAndWaistcoatsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/blazerswaistcoats.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.BLAZERS);
    }
}
