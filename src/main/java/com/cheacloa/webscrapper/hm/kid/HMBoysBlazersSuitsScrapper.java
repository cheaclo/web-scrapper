package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMBoysBlazersSuitsScrapper extends HMScrapper {
    public HMBoysBlazersSuitsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/boys/clothing/blazers-suits.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.BLAZERS, Product.Category.SUITS);
    }
}
