package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedProductsRetriever {
    @Autowired
    ReservedWomenProductsRetriever reservedWomenProductsRetriever;
    @Autowired
    ReservedMenProductsRetriever reservedMenProductsRetriever;
    @Autowired
    ReservedGrilsProductsRetriever reservedGrilsProductsRetriever;
    @Autowired
    ReservedBoysProductsRetriever reservedBoysProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    /* temporary solution */
    @PostConstruct
    public void postConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] Reserved scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomenProductsRetriever.run(driver));
        products.addAll(reservedMenProductsRetriever.run(driver));
        products.addAll(reservedGrilsProductsRetriever.run(driver));
        products.addAll(reservedBoysProductsRetriever.run(driver));

        driver.close();

        System.out.println("Reserved products number: " + products.size()); //LOG
        System.out.println("[INFO] Reserved scrapping finished"); //LOG
        return products;
    }
}
