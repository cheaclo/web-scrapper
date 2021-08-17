package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManShoesScrapper extends HMScrapper {
    public HMManShoesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/shoes.html";
        shop = Shop.HM;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.SHOES);
    }
}
