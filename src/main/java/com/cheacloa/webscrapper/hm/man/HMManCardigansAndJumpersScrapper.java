package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.model.Shop;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManCardigansAndJumpersScrapper extends HMScrapper {
    public HMManCardigansAndJumpersScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/cardigansjumpers.html";
        shop = Shop.HM;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.CARDIGANS_AND_JUMPERS);
    }
}
