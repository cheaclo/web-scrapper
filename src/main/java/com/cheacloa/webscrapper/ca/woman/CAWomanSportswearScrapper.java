package com.cheacloa.webscrapper.ca.woman;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAWomanSportswearScrapper extends CAScrapper {
    public CAWomanSportswearScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-women-clothing-sportswear";
        shop = Shop.CA;
        type = Type.WOMAN;
        categories = Arrays.asList(Category.SPORTS);
    }
}
