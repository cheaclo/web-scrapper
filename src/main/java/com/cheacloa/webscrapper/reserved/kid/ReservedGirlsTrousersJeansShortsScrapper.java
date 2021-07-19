package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsTrousersJeansShortsScrapper extends ReservedScrapper {
    public ReservedGirlsTrousersJeansShortsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/trousers";
        shop = Product.Shop.RESERVED;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TROUSERS_AND_LEGGINGS,
                                    Product.Category.JEANS,
                                    Product.Category.SKIRTS_AND_SHORTS);
    }
}
