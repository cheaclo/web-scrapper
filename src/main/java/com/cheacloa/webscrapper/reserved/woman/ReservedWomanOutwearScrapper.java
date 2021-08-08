package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanOutwearScrapper extends ReservedScrapper {
    public ReservedWomanOutwearScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/outerwear";
        shop = Shop.RESERVED;
        type = Type.WOMAN;
        categories = Arrays.asList(Category.JACKETS_AND_COATS);
    }
}
