package com.cheacloa.webscrapper.hm.kid;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMBoysSetsAndOutfitsScrapper extends HMScrapper {
    public HMBoysSetsAndOutfitsScrapper() {
        url = "https://www2.hm.com/en_gb/sale/kids/boys/clothing/sets-outfits.html";
        shop = Product.Shop.HM;
        type = Product.Type.KID;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
