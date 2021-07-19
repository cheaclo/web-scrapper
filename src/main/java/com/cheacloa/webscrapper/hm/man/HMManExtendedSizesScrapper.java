package com.cheacloa.webscrapper.hm.man;

import com.cheacloa.webscrapper.hm.HMScrapper;
import com.cheacloa.webscrapper.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HMManExtendedSizesScrapper extends HMScrapper {
    public HMManExtendedSizesScrapper() {
        url = "https://www2.hm.com/en_gb/sale/men/extended-sizes.html";
        shop = Product.Shop.HM;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.OTHERS);
    }
}
