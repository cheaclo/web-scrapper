package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Component
public class ProductsRetriever {
    @Autowired
    private WomenProductsRetriever ladiesProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    /* temporary solution */
    @PostConstruct
    public void postConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        List<Product> women = ladiesProductsRetriever.run(driver);

        products.addAll(women);

        driver.close();
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
