package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHTrousersScrapper extends CAScrapper {
    public CAManCHTrousersScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-trousers-shorts-trousers";
        shop = Shop.CA;
        type = Type.MAN;
        categories = Arrays.asList(Category.TROUSERS_AND_LEGGINGS);
    }
}
