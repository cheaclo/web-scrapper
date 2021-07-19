package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    private HMKidsProductsRetriever kidsProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    /* temporary solution
    @PostConstruct
    public void postConstruct() {
        run();
    } */

    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(ladiesProductsRetriever.run(driver));
        products.addAll(unisexProductsRetriever.run(driver));
        products.addAll(menProductsRetriever.run(driver));
        products.addAll(kidsProductsRetriever.run(driver));

        driver.close();

        System.out.println("HM products number: " + products.size()); //LOG
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
