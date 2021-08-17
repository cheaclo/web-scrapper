package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanSweatshirtsScrapper extends ReservedScrapper {
    public ReservedWomanSweatshirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/sweatshirts";
        shop = Shop.RESERVED;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
