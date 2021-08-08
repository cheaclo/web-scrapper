package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexCardagiansAndJumpersScrapper extends HMScrapper {
    public HMUnisexCardagiansAndJumpersScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/cardigans-jumpers.html";
        shop = Shop.HM;
        type = Type.UNISEX;
        categories = Arrays.asList(Category.CARDIGANS_AND_JUMPERS);
    }
}
