package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexJacketsAndCoatsScrapper extends HMScrapper {
    public HMUnisexJacketsAndCoatsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/jackets-and-blazers.html";
        shop = Shop.HM;
        type = Type.UNISEX;
        categories = Arrays.asList(Category.JACKETS_AND_COATS);
    }
}
