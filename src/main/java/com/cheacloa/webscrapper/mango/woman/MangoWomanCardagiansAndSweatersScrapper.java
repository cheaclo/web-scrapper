package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanCardagiansAndSweatersScrapper extends MangoScrapper {
    public MangoWomanCardagiansAndSweatersScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-cardigans-and-sweaters_d10704819";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.CARDIGANS_AND_JUMPERS);
    }
}
