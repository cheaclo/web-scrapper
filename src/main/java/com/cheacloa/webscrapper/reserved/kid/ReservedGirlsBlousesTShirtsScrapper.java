package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsBlousesTShirtsScrapper extends ReservedScrapper {
    public ReservedGirlsBlousesTShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/t-shirts";
        shop = Shop.RESERVED;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.TSHIRTS_AND_TOPS, ProductCategory.SHIRTS_AND_BLOUSES);
    }
}
