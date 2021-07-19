package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanDressesAndJumpsuitsScrapper extends ReservedScrapper {
    public ReservedWomanDressesAndJumpsuitsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/dresses";
        shop = Product.Shop.RESERVED;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
