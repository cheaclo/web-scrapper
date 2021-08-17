package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManSweatshirtsAndSweatJacketsScrapper extends CAScrapper {
    public CAManSweatshirtsAndSweatJacketsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clothing-sweatshirts-sweatjackets";
        shop = Shop.CA;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
