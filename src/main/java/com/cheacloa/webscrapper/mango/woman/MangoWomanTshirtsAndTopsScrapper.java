package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanTshirtsAndTopsScrapper extends MangoScrapper {
    public MangoWomanTshirtsAndTopsScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-t-shirts-and-tops_d40040069";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
