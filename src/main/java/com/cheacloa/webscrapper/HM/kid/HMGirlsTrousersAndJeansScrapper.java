package com.cheacloa.webscrapper.HM.kid;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsTrousersAndJeansScrapper extends HMScrapper {
    public HMGirlsTrousersAndJeansScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/jeans.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TROUSERS_AND_LEGGINGS, Product.Category.JEANS);
    }
}
