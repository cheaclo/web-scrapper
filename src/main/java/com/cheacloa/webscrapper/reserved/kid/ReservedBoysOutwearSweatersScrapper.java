package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedBoysOutwearSweatersScrapper extends ReservedScrapper {
    public ReservedBoysOutwearSweatersScrapper() {
        url = "https://www.reserved.com/gb/en/sale/boys/outerwear";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS,
                                   Product.Category.SWEATSHIRTS_HOODIES_AND_SWEATERS);
    }
}
