package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanShirtsAndBlousesScrapper extends HMScrapper {
    public HMWomanShirtsAndBlousesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/swimwear.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SHIRTS_AND_BLOUSES);
    }
}
