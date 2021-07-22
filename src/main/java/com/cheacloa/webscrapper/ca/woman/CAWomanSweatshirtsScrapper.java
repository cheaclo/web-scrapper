package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanSweatshirtsScrapper extends CAScrapper {
    public CAWomanSweatshirtsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-sweatshirts-sweatjackets";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
