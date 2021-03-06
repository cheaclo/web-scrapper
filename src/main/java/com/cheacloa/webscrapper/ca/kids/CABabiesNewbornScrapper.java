package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CABabiesNewbornScrapper extends CAScrapper {
    public CABabiesNewbornScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-babies-sale-newborn";
        shop = Shop.CA;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.BABIES);
    }
}
