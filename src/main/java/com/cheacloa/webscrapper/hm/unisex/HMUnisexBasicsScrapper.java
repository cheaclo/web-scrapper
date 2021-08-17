package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexBasicsScrapper extends HMScrapper {
    public HMUnisexBasicsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/basics.html";
        shop = Shop.HM;
        type = ProductType.UNISEX;
        categories = Arrays.asList(ProductCategory.OTHERS);
    }
}
