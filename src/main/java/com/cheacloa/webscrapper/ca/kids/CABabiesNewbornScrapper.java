package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CABabiesNewbornScrapper extends CAScrapper {
    public CABabiesNewbornScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-babies-sale-newborn";
        shop = Product.Shop.CA;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.BABIES);
    }
}
