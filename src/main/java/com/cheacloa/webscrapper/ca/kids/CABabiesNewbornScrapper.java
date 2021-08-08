package com.cheacloa.webscrapper.ca.kids;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CABabiesNewbornScrapper extends CAScrapper {
    public CABabiesNewbornScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-babies-sale-newborn";
        shop = Shop.CA;
        type = Type.KID;
        categories = Arrays.asList(Category.BABIES);
    }
}
