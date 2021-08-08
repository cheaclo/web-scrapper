package com.cheacloa.webscrapper.hm.woman;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanShirtsAndBlousesScrapper extends HMScrapper {
    public HMWomanShirtsAndBlousesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/swimwear.html";
        shop = Shop.HM;
        type = Type.WOMAN;
        categories = Arrays.asList(Category.SHIRTS_AND_BLOUSES);
    }
}
