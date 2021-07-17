package com.cheacloa.webscrapper.HM.kid;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMGirlsSocksScrapper extends HMScrapper {
    public HMGirlsSocksScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/girls/clothing/socks-tights.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.SOCKS);
    }
}
