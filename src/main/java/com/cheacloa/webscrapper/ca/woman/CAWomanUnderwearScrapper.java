package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanUnderwearScrapper extends CAScrapper {
    public CAWomanUnderwearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-underwear";
        shop = Shop.CA;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.UNDERWEAR_AND_NIGHTWEAR);
    }
}
