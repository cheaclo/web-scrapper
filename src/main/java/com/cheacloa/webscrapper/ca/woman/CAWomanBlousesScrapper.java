package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanBlousesScrapper extends CAScrapper {
    public CAWomanBlousesScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-blouses";
        shop = Shop.CA;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.SHIRTS_AND_BLOUSES);
    }
}
