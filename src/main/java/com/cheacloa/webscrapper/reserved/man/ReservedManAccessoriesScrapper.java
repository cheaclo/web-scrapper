package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManAccessoriesScrapper extends ReservedScrapper {
    public ReservedManAccessoriesScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/accessories";
        shop = Product.Shop.RESERVED;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
