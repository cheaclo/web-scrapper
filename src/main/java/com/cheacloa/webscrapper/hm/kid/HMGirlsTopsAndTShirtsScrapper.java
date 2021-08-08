package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsTopsAndTShirtsScrapper extends HMScrapper {
    public HMGirlsTopsAndTShirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/tops-t-shirts.html";
        shop = Shop.HM;
        type = Type.KID;
        categories = Arrays.asList(Category.TSHIRTS_AND_TOPS);
    }
}
