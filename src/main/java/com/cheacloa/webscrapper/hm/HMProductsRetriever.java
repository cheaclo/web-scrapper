package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.service.CustomWebDriver;
import com.cheacloa.webscrapper.service.ProductsSender;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HMProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(HMProductsRetriever.class);

    private final HMWomenProductsSubRetriever ladiesProductsRetriever;
    private final HMUnisexProductsSubRetriever unisexProductsRetriever;
    private final HMMenProductsSubRetriever menProductsRetriever;
    private final HMKidsProductsSubRetriever kidsProductsRetriever;

    private final CustomWebDriver customWebDriver;
    private final ProductsSender productsSender;

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

        productsSender.sendProducts(products, Shop.HM);
    }
}
