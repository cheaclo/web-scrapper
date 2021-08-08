package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanNightwearAndLoungewearScrapper extends HMScrapper {
    public HMWomanNightwearAndLoungewearScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/nightwear.html";
        shop = Shop.HM;
        type = Type.WOMAN;
        categories = Arrays.asList(Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
