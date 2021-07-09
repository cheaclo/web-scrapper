package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.HM.Scrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MaternityWearScrapper extends Scrapper {
    public MaternityWearScrapper() {
        url = "https://www2.hm.com/en_gb/sale/ladies/maternitywear.html";
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
