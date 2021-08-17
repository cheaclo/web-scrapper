package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsTrousersJeansShortsScrapper extends ReservedScrapper {
    public ReservedGirlsTrousersJeansShortsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/trousers";
        shop = Shop.RESERVED;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.TROUSERS_AND_LEGGINGS,
                                    ProductCategory.JEANS,
                                    ProductCategory.SKIRTS_AND_SHORTS);
    }
}
