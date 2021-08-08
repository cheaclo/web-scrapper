package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidNightwearAndUnderwearScrapper extends CAScrapper {
    public CAKidNightwearAndUnderwearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-nightwear-underwear";
        shop = Shop.CA;
        type = Type.KID;
        categories = Arrays.asList(Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
