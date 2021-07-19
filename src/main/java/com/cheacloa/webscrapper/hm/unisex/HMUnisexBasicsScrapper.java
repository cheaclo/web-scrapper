package com.cheacloa.webscrapper.hm.unisex;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexBasicsScrapper extends HMScrapper {
    public HMUnisexBasicsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/basics.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
