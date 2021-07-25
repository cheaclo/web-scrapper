package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHShortsScrapper extends CAScrapper {
    public CAManCHShortsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-trousers-shorts-shorts";
        shop = Product.Shop.CA;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SKIRTS_AND_SHORTS);
    }
}
