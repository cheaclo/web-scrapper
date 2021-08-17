package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManShirtsScrapper extends ReservedScrapper {
    public ReservedManShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/shirts";
        shop = Shop.RESERVED;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.TSHIRTS_AND_TOPS);
    }
}
