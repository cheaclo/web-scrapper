package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanShirtsAndTopsScrapper extends CAScrapper {
    public CAWomanShirtsAndTopsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-shirts-tops";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SHIRTS_AND_BLOUSES, Product.Category.TSHIRTS_AND_TOPS);
    }
}
