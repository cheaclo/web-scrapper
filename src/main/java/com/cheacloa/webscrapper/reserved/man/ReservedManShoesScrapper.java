package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManShoesScrapper extends ReservedScrapper {
    public ReservedManShoesScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/shoes";
        shop = Product.Shop.RESERVED;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SHOES);
    }
}
