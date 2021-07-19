package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedBoysBestsellersScrapper extends ReservedScrapper {
    public ReservedBoysBestsellersScrapper() {
        url = "https://www.reserved.com/gb/en/sale/boys/bestsellers-gb";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TRENDS);
    }
}
