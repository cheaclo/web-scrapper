package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanBusinessWearScrapper extends CAScrapper {
    public CAWomanBusinessWearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-businesswear";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
