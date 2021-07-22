package com.cheacloa.webscrapper.mango.woman;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.mango.MangoScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MangoWomanUnderwearAndLingerieScrapper extends MangoScrapper {
    public MangoWomanUnderwearAndLingerieScrapper() {
        url = "https://shop.mango.com/gb/women/featured/sale-underwear-and-lingerie_d23540402";
        shop = Product.Shop.MANGO;
        type = Product.Type.WOMAN;
        categories = Arrays.asList(Product.Category.LINGERIE, Product.Category.UNDERWEAR_AND_NIGHTWEAR);
    }
}
