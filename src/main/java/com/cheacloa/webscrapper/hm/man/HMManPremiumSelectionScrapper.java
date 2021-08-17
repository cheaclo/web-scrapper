package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManPremiumSelectionScrapper extends HMScrapper {
    public HMManPremiumSelectionScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/premium-selection.html";
        shop = Shop.HM;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.OTHERS);
    }
}
