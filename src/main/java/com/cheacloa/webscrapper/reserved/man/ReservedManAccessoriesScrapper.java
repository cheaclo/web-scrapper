package com.cheacloa.webscrapper.reserved.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedManAccessoriesScrapper extends ReservedScrapper {
    public ReservedManAccessoriesScrapper() {
        url = "https://www.reserved.com/gb/en/sale/men/accessories";
        shop = Shop.RESERVED;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.ACCESSORIES);
    }
}
