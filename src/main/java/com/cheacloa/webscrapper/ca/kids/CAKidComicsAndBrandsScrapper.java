package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidComicsAndBrandsScrapper extends CAScrapper {
    public CAKidComicsAndBrandsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-comic-characters";
        shop = Shop.CA;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.OTHERS);
    }
}
