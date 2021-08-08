package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManNightwearAndLoungewearScrapper extends HMScrapper {
    public HMManNightwearAndLoungewearScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/nightwear-loungewear.html";
        shop = Shop.HM;
        type = Type.MAN;
        categories = Arrays.asList(Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
