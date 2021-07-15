package com.cheacloa.webscrapper.HM.man;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManShoesScrapper extends HMScrapper {
    public HMManShoesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/shoes.html";
        shop = Product.Shop.HM;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SHOES);
    }
}
