package com.cheacloa.webscrapper.reserved;

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

@Component
@RequiredArgsConstructor
public class ReservedProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(ReservedProductsRetriever.class);

    private final ReservedWomenProductsSubRetriever reservedWomenProductsRetriever;
    private final ReservedMenProductsSubRetriever reservedMenProductsRetriever;
    private final ReservedGirlsProductsSubRetriever reservedGirlsProductsSubRetriever;
    private final ReservedBoysProductsSubRetriever reservedBoysProductsRetriever;

    private final CustomWebDriver customWebDriver;
    private final ProductsSender productsSender;

    public void retrieve() {
        LOG.info("Reserved scrapping started");

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomenProductsRetriever.run(driver));
        products.addAll(reservedMenProductsRetriever.run(driver));
        products.addAll(reservedGirlsProductsSubRetriever.run(driver));
        products.addAll(reservedBoysProductsRetriever.run(driver));

        driver.close();

        LOG.info("Reserved products number: " + products.size());
        LOG.info("Reserved scrapping finished");

        productsSender.sendProducts(products, Shop.RESERVED);
    }
}
