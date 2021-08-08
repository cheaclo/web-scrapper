package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMBoysOutwearsScrapper extends HMScrapper {
    public HMBoysOutwearsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/boys/clothing/outerwear.html";
        shop = Shop.HM;
        type = Type.KID;
        categories = Arrays.asList(Category.JACKETS_AND_COATS);
    }
}
