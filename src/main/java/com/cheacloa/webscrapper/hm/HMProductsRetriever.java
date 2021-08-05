package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.ca.CAProductsRetriever;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Component
public class HMProductsRetriever {
    private Logger log = LoggerFactory.getLogger(HMProductsRetriever.class);

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

    public void retrieve() {
        log.info("Hm scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(ladiesProductsRetriever.run(driver));
        products.addAll(unisexProductsRetriever.run(driver));
        products.addAll(menProductsRetriever.run(driver));
        products.addAll(kidsProductsRetriever.run(driver));

        driver.close();

        log.info("HM products number: " + products.size());
        log.info("Hm scrapping finished");
        log.info("Finished at " + LocalDateTime.now());
        /* TODO: send products to database */
    }
}
