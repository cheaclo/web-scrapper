package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsOutwearSweatersScrapper extends ReservedScrapper {
    public ReservedGirlsOutwearSweatersScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/outerwear";
        shop = Shop.RESERVED;
        type = Type.KID;
        categories = Arrays.asList(Category.JACKETS_AND_COATS,
                                    Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
