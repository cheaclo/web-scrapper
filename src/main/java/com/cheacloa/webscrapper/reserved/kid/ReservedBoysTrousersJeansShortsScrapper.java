package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedBoysTrousersJeansShortsScrapper extends ReservedScrapper {
    public ReservedBoysTrousersJeansShortsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/boys/trousers";
        shop = Shop.RESERVED;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.TROUSERS_AND_LEGGINGS,
                                    ProductCategory.JEANS,
                                    ProductCategory.SKIRTS_AND_SHORTS);
    }
}
