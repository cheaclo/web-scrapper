package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(ReservedProductsRetriever.class);

    @Autowired
    ReservedWomenProductsSubRetriever reservedWomenProductsRetriever;
    @Autowired
    ReservedMenProductsSubRetriever reservedMenProductsRetriever;
    @Autowired
    ReservedGrilsProductsSubRetriever reservedGrilsProductsRetriever;
    @Autowired
    ReservedBoysProductsSubRetriever reservedBoysProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    public void retrieve() {
        LOG.info("Reserved scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomenProductsRetriever.run(driver));
        products.addAll(reservedMenProductsRetriever.run(driver));
        products.addAll(reservedGrilsProductsRetriever.run(driver));
        products.addAll(reservedBoysProductsRetriever.run(driver));

        driver.close();

        LOG.info("Reserved products number: " + products.size());
        LOG.info("Reserved scrapping finished");
        /* TODO: send products to database */
    }
}
