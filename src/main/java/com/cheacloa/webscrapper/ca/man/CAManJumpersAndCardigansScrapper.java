package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManJumpersAndCardigansScrapper extends CAScrapper {
    public CAManJumpersAndCardigansScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clothing-pullover-cardigans";
        shop = Product.Shop.CA;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.CARDIGANS_AND_JUMPERS);
    }
}
