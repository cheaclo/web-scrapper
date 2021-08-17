package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHJacketsAndCoatsScrapper extends CAScrapper {
    public CAManCHJacketsAndCoatsScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-jackets-coats";
        shop = Shop.CA;
        type = ProductType.MAN;
        categories = Arrays.asList(ProductCategory.JACKETS_AND_COATS);
    }
}
