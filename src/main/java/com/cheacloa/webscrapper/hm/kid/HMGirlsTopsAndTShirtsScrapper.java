package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsTopsAndTShirtsScrapper extends HMScrapper {
    public HMGirlsTopsAndTShirtsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/tops-t-shirts.html";
        shop = Shop.HM;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.TSHIRTS_AND_TOPS);
    }
}
