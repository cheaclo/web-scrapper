package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanTShirtsScrapper extends ReservedScrapper {
    public ReservedWomanTShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/t-shirts";
        shop = Product.Shop.RESERVED;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
