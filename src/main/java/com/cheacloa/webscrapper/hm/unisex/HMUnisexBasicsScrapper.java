package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexBasicsScrapper extends HMScrapper {
    public HMUnisexBasicsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/basics.html";
        shop = Shop.HM;
        type = Type.UNISEX;
        categories = Arrays.asList(Category.OTHERS);
    }
}
