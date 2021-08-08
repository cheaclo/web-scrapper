package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManShortsScrapper extends ReservedScrapper {
    public ReservedManShortsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/shorts";
        shop = Shop.RESERVED;
        type = Type.MAN;
        categories = Arrays.asList(Category.SKIRTS_AND_SHORTS);
    }
}
