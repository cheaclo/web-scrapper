package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.Scrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DivideScrapper extends Scrapper {
    public DivideScrapper() {
        numberOfProductsSelector = "#page-content > div > div:nth-child(3) > div.products-filter-container > div.products-filter.sticky-on-scroll > form > div";
        url = "https://www2.hm.com/en_gb/sale/ladies/divided.html";

        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
