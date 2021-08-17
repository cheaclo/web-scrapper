package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHTrousersScrapper extends CAScrapper {
    public CAManCHTrousersScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-trousers-shorts-trousers";
        shop = Shop.CA;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.TROUSERS_AND_LEGGINGS);
    }
}
