package com.cheacloa.webscrapper.reserved.woman;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedWomanJacketsScrapper extends ReservedScrapper {
    public ReservedWomanJacketsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/women/jackets";
        shop = Shop.RESERVED;
        type = Type.WOMAN;
        categories = Arrays.asList(Category.JACKETS_AND_COATS);
    }
}
