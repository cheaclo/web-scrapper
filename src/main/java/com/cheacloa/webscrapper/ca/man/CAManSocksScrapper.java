package com.cheacloa.webscrapper.ca.man;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAScrapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CAManSocksScrapper extends CAScrapper {
    public CAManSocksScrapper() {
        url = "https://www.c-and-a.com/eu/en/shop/sale-men-clothing-socks";
        shop = Product.Shop.CA;
        type = Product.Type.MAN;
        categories = Arrays.asList(Product.Category.SOCKS);
    }
}
