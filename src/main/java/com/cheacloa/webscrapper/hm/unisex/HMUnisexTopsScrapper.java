package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexTopsScrapper extends HMScrapper {
    public HMUnisexTopsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/tops.html";
        shop = Shop.HM;
        type = Type.UNISEX;
        categories = Arrays.asList(Category.TSHIRTS_AND_TOPS);
    }
}
