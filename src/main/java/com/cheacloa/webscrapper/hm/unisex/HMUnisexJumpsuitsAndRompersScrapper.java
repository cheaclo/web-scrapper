package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexJumpsuitsAndRompersScrapper extends HMScrapper {
    public HMUnisexJumpsuitsAndRompersScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/jumpsuits-playsuits.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}