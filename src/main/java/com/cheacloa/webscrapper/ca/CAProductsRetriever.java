package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class CAProductsRetriever {
    private final Logger log = LoggerFactory.getLogger(CAProductsRetriever.class);

    @Autowired
    private CAWomenProductsRetriever caWomenProductsRetriever;
    @Autowired
    private CAMenProductsRetriever caMenProductsRetriever;
    @Autowired
    private CAKidsProductsRetriever caKidsProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    public void retrieve() {
        log.info("CA scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<Product> products = new LinkedList<>();

        products.addAll(caWomenProductsRetriever.run(driver));
        products.addAll(caMenProductsRetriever.run(driver));
        products.addAll(caKidsProductsRetriever.run(driver));

        driver.close();

        log.info("CA products number: " + products.size());
        log.info("CA scrapping finished");
        /* TODO: send products to database */
    }
}
