package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidNightwearAndUnderwearScrapper extends CAScrapper {
    public CAKidNightwearAndUnderwearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-nightwear-underwear";
        shop = Product.Shop.CA;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
