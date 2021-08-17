package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidBottomsScrapper extends CAScrapper {
    public CAKidBottomsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-bottoms";
        shop = Shop.CA;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.SKIRTS_AND_SHORTS);
    }
}
