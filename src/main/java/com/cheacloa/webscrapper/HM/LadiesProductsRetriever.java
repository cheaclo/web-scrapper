package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.woman.*;
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
    @Autowired
    private TrendsScrapper trendsScrapper;
    @Autowired
    private DressesScrapper dressesScrapper;
    @Autowired
    private SwimwearScrapper swimwearScrapper;
    @Autowired
    private ShirtsAndBlousesScrapper shirtsAndBlousesScrapper;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new ArrayList<>();

        products.addAll(accessoriesScrapper.run(driver));
        System.out.println(products.size());  //LOG
        products.addAll(divideScrapper.run(driver));
        System.out.println(products.size()); //LOG
        products.addAll(trendsScrapper.run(driver));
        System.out.println(products.size()); //LOG
        products.addAll(dressesScrapper.run(driver));
        System.out.println(products.size());  //LOG
        products.addAll(swimwearScrapper.run(driver));
        System.out.println(products.size()); //LOG
        products.addAll(shirtsAndBlousesScrapper.run(driver));
        System.out.println(products.size()); //LOG

        return products;
    }
}
