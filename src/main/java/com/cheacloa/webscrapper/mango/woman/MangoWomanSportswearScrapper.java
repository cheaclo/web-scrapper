package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanSportswearScrapper extends MangoScrapper {
    public MangoWomanSportswearScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-sportswear_d88201742";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SPORTS);
    }
}
