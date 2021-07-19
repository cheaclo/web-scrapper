package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsAccessoriesScrapper extends ReservedScrapper {
    public ReservedGirlsAccessoriesScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/accessories";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.ACCESSORIES);
    }
}
