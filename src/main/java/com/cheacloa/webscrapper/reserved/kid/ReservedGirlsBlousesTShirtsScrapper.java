package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedGirlsBlousesTShirtsScrapper extends ReservedScrapper {
    public ReservedGirlsBlousesTShirtsScrapper() {
        url = "https://www.reserved.com/gb/en/sale/girls/t-shirts";
        shop = Shop.RESERVED;
        type = Type.KID;
        categories = Arrays.asList(Category.TSHIRTS_AND_TOPS, Category.SHIRTS_AND_BLOUSES);
    }
}
