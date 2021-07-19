package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanOutwearScrapper extends ReservedScrapper {
    public ReservedWomanOutwearScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/outerwear";
        shop = Product.Shop.RESERVED;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS);
    }
}
