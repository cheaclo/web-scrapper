package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.service.CustomWebDriver;
import com.cheacloa.webscrapper.service.ProductsSender;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
public class CAProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(CAProductsRetriever.class);

    private final CAWomenProductsSubRetriever caWomenProductsRetriever;
    private final CAMenProductsSubRetriever caMenProductsRetriever;
    private final CAKidsProductsSubRetriever caKidsProductsRetriever;

    private final CustomWebDriver customWebDriver;
    private final ProductsSender productsSender;

    public void retrieve() {
        LOG.info("CA scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<Product> products = new LinkedList<>();

        products.addAll(caWomenProductsRetriever.run(driver));
        products.addAll(caMenProductsRetriever.run(driver));
        products.addAll(caKidsProductsRetriever.run(driver));

        driver.close();

        LOG.info("CA products number: " + products.size());
        LOG.info("CA scrapping finished");

        productsSender.sendProducts(products, Shop.CA);
    }
}
