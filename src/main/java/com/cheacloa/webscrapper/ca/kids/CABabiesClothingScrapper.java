package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CABabiesClothingScrapper extends CAScrapper {
    public CABabiesClothingScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-babies";
        shop = Product.Shop.CA;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.BABIES);
    }
}
