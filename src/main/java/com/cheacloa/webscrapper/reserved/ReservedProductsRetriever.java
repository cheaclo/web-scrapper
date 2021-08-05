package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.hm.HMScrapper;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedProductsRetriever {
    private Logger log = LoggerFactory.getLogger(ReservedProductsRetriever.class);

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

    public void retrieve() {
        log.info("Reserved scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomenProductsRetriever.run(driver));
        products.addAll(reservedMenProductsRetriever.run(driver));
        products.addAll(reservedGrilsProductsRetriever.run(driver));
        products.addAll(reservedBoysProductsRetriever.run(driver));

        driver.close();

        log.info("Reserved products number: " + products.size());
        log.info("Reserved scrapping finished");
        /* TODO: send products to database */
    }
}
