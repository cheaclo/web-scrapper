package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanJacketsAndCoatsScrapper extends CAScrapper {
    public CAWomanJacketsAndCoatsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-outerwear";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.JACKETS_AND_COATS);
    }
}
