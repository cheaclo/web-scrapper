package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManShortsScrapper extends HMScrapper {
    public HMManShortsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/shorts.html";
        shop = Shop.HM;
        type = Type.MAN;
        categories = Arrays.asList(Category.SKIRTS_AND_SHORTS);
    }
}
