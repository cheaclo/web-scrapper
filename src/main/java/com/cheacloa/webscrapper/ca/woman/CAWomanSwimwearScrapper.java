package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanSwimwearScrapper extends CAScrapper {
    public CAWomanSwimwearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-swimwear";
        shop = Shop.CA;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.SWIMWEAR);
    }
}
