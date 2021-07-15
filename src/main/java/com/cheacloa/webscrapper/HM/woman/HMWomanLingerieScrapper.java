package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMWomanLingerieScrapper extends HMScrapper {
    public HMWomanLingerieScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/lingerie.html";
        shop = Product.Shop.HM;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.LINGERIE);
    }
}
