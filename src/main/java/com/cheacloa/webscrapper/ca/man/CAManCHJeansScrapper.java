package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManCHJeansScrapper extends CAScrapper {
    public CAManCHJeansScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clockhouse-jeans";
        shop = Shop.CA;
        type = Type.MAN;
        categories = Arrays.asList(Category.JEANS);
    }
}
