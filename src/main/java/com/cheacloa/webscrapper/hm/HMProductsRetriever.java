package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Component
public class HMProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(HMProductsRetriever.class);

    @Autowired
    private HMWomenProductsSubRetriever ladiesProductsRetriever;
    @Autowired
    private HMUnisexProductsSubRetriever unisexProductsRetriever;
    @Autowired
    private HMMenProductsSubRetriever menProductsRetriever;
    @Autowired
    private HMKidsProductsSubRetriever kidsProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    public void retrieve() {
        LOG.info("Hm scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(ladiesProductsRetriever.run(driver));
        products.addAll(unisexProductsRetriever.run(driver));
        products.addAll(menProductsRetriever.run(driver));
        products.addAll(kidsProductsRetriever.run(driver));

        driver.close();

        LOG.info("HM products number: " + products.size());
        LOG.info("Hm scrapping finished");
        LOG.info("Finished at " + LocalDateTime.now());
        /* TODO: send products to database */
    }
}
