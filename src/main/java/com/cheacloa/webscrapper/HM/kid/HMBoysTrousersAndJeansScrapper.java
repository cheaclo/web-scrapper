package com.cheacloa.webscrapper.HM.kid;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMBoysTrousersAndJeansScrapper extends HMScrapper {
    public HMBoysTrousersAndJeansScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/boys/clothing/trousers-jeans.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.TROUSERS_AND_LEGGINGS, Product.Category.JEANS);
    }
}
