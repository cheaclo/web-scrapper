package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanEveningWearScrapper extends CAScrapper {
    public CAWomanEveningWearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-evening-wear";
        shop = Product.Shop.CA;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
