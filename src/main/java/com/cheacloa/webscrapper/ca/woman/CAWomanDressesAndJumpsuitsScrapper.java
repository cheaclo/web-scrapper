package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanDressesAndJumpsuitsScrapper extends CAScrapper {
    public CAWomanDressesAndJumpsuitsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-dresses-jumpsuits";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
