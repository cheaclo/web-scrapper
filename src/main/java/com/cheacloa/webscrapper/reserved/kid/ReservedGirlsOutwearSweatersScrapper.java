package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsOutwearSweatersScrapper extends ReservedScrapper {
    public ReservedGirlsOutwearSweatersScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/outerwear";
        shop = Shop.RESERVED;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.JACKETS_AND_COATS,
                                    ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
