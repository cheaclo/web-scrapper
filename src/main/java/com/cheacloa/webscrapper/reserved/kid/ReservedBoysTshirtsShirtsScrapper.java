package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedBoysTshirtsShirtsScrapper extends ReservedScrapper {
    public ReservedBoysTshirtsShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/boys/t-shirts";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS, Product.Category.SHIRTS_AND_BLOUSES);
    }
}
