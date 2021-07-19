package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsDressesScrapper extends ReservedScrapper {
    public ReservedGirlsDressesScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/dresses";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
