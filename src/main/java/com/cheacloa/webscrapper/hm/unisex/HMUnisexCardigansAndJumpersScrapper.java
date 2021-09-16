package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.model.Shop;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexCardigansAndJumpersScrapper extends HMScrapper {
    public HMUnisexCardigansAndJumpersScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/cardigans-jumpers.html";
        shop = Shop.HM;
        type = ProductType.UNISEX;
        categories = Arrays.asList(ProductCategory.CARDIGANS_AND_JUMPERS);
    }
}
