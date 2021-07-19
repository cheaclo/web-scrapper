package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManSocksScrapper extends HMScrapper {
    public HMManSocksScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/socks.html";
        shop = Product.Shop.HM;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SOCKS);
    }
}
