package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsJumpersAndSweatshirtsScrapper extends HMScrapper {
    public HMGirlsJumpersAndSweatshirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/jumpers-sweatshirts.html";
        shop = Shop.HM;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
