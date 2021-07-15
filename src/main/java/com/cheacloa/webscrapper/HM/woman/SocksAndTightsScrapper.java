package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.Scrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SocksAndTightsScrapper extends Scrapper {
    public SocksAndTightsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/sockstights.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.SOCKS);
    }
}
