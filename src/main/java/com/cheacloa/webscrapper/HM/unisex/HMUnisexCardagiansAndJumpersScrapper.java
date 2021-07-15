package com.cheacloa.webscrapper.HM.unisex;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexCardagiansAndJumpersScrapper extends HMScrapper {
    public HMUnisexCardagiansAndJumpersScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/cardigans-jumpers.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.CARDIGANS_AND_JUMPERS);
    }
}
