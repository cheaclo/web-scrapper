package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHSweatshirtsScrapper extends CAScrapper {
    public CAManCHSweatshirtsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-sweatshirts";
        shop = Product.Shop.CA;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
