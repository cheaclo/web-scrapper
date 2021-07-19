package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsDressesScrapper extends HMScrapper {
    public HMGirlsDressesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/dresses.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
