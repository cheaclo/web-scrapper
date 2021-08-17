package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidTopsScrapper extends CAScrapper {
    public CAKidTopsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-tops";
        shop = Shop.CA;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.TSHIRTS_AND_TOPS);
    }
}
