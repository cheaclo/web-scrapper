package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManBlazersAndSuitsScrapper extends HMScrapper {
    public HMManBlazersAndSuitsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/blazerssuits.html";
        shop = Shop.HM;
        type = Type.MAN;
        categories = Arrays.asList(Category.SUITS, Category.BLAZERS);
    }
}
