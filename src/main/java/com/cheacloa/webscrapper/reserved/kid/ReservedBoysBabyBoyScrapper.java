package com.cheacloa.webscrapper.reserved.kid;

import com.cheacloa.webscrapper.Category;
import com.cheacloa.webscrapper.Shop;
import com.cheacloa.webscrapper.Type;
import com.cheacloa.webscrapper.reserved.ReservedScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReservedBoysBabyBoyScrapper extends ReservedScrapper {
    public ReservedBoysBabyBoyScrapper() {
        url = "https://www.reserved.com/gb/en/sale/boys/baby-boy";
        shop = Shop.RESERVED;
        type = Type.KID;
        categories = Arrays.asList(Category.BABIES);
    }
}
