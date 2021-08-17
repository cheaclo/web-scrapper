package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanJeansScrapper extends CAScrapper {
    public CAWomanJeansScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-jeans";
        shop = Shop.CA;
        type = ProductType.WOMAN;
        categories = Arrays.asList(ProductCategory.JEANS);
    }
}
