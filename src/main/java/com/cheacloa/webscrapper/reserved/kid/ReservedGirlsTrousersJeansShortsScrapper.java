package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsTrousersJeansShortsScrapper extends ReservedScrapper {
    public ReservedGirlsTrousersJeansShortsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/trousers";
        shop = Shop.RESERVED;
        type = Type.KID;
        categories = Arrays.asList(Category.TROUSERS_AND_LEGGINGS,
                                    Category.JEANS,
                                    Category.SKIRTS_AND_SHORTS);
    }
}
