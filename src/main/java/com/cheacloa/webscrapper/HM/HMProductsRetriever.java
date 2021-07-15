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
public class HMProductsRetriever {
    @Autowired
    private HMWomenProductsRetriever ladiesProductsRetriever;
    @Autowired
    private HMUnisexProductsRetriever unisexProductsRetriever;
    @Autowired
    private HMMenProductsRetriever menProductsRetriever;

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
        List<Product> unisex = unisexProductsRetriever.run(driver);
        List<Product> men = menProductsRetriever.run(driver);

        products.addAll(women);
        products.addAll(unisex);
        products.addAll(men);

        driver.close();

        System.out.println("HM products number: " + products.size());
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
