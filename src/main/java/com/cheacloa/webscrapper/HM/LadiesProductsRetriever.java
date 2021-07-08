package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.woman.AccessoriesScrapper;
import com.cheacloa.webscrapper.HM.woman.DivideScrapper;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LadiesProductsRetriever {
    @Autowired
    private AccessoriesScrapper accessoriesScrapper;
    @Autowired
    private DivideScrapper divideScrapper;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new ArrayList<>();

        products.addAll(accessoriesScrapper.run(driver));
        System.out.println(products.size());
        products.addAll(divideScrapper.run(driver));
        System.out.println(products.size());

        return products;
    }
}
