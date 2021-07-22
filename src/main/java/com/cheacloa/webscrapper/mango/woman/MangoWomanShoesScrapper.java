package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanShoesScrapper extends MangoScrapper {
    public MangoWomanShoesScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-shoes_d17828221";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SHOES);
    }
}
