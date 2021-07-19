package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManTShirtsAndTanksScrapper extends HMScrapper {
    public HMManTShirtsAndTanksScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/tshirtstanks.html";
        shop = Product.Shop.HM;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
