package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAKidAccessoriesSocksShoesScrapper extends CAScrapper {
    public CAKidAccessoriesSocksShoesScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-kids-accessories-socks-shoes";
        shop = Shop.CA;
        type = ProductType.KID;
        categories = Arrays.asList(ProductCategory.ACCESSORIES, ProductCategory.SHOES, ProductCategory.SOCKS);
    }
}
