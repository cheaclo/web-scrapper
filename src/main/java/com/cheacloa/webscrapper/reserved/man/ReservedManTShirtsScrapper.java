package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManTShirtsScrapper extends ReservedScrapper {
    public ReservedManTShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/t-shirts";
        shop = Product.Shop.RESERVED;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
