package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanSwimsuitsAndBikinisScrapper extends MangoScrapper {
    public MangoWomanSwimsuitsAndBikinisScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-bikinis-and-swimsuits_d79967955";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SKIRTS_AND_SHORTS);
    }
}
