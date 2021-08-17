package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexShirtsAndBlouesesScrapper extends HMScrapper {
    public HMUnisexShirtsAndBlouesesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/shirts-and-blouses.html";
        shop = Shop.HM;
        type = ProductType.UNISEX;
        categories = Arrays.asList(ProductCategory.DRESSES_AND_JUMPSUITS);
    }
}
