package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.Scrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TopsScrapper extends Scrapper {
    public TopsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/tops.html";
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.TSHIRTS_AND_TOPS);
    }
}
