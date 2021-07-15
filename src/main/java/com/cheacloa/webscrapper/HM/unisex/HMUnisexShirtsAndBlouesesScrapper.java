package com.cheacloa.webscrapper.HM.unisex;

import com.cheacloa.webscrapper.HM.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMUnisexShirtsAndBlouesesScrapper extends HMScrapper {
    public HMUnisexShirtsAndBlouesesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/divided/shirts-and-blouses.html";
        shop = Product.Shop.HM;
        type = Product.Type.UNISEX;
        categories = Arrays.asList(Product.Category.DRESSES_AND_JUMPSUITS);
    }
}
