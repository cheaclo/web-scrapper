package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanDressesAndJumpsuitsScrapper extends MangoScrapper {
    public MangoWomanDressesAndJumpsuitsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-dresses-and-jumpsuits_d19494371";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
