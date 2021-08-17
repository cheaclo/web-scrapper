package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManSweatshirtsScrapper extends ReservedScrapper {
    public ReservedManSweatshirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/sweatshirts";
        shop = Shop.RESERVED;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
