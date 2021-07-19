package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsBlousesTShirtsScrapper extends ReservedScrapper {
    public ReservedGirlsBlousesTShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/t-shirts";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS, Product.Category.SHIRTS_AND_BLOUSES);
    }
}
