package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanJumpsuitsScrapper extends HMScrapper {
    public HMWomanJumpsuitsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/jumpsuits.html";
        shop = Shop.HM;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.DRESSES_AND_JUMPSUITS);
    }
}
