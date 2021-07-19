package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.Retriever;
import com.cheacloa.webscrapper.reserved.kid.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedBoysProductsRetriever implements Retriever {
    @Autowired ReservedBoysAccessoriesrScrapper reservedBoysAccessoriesrScrapper;
    @Autowired ReservedBoysBabyBoyScrapper reservedBoysBabyBoyScrapper;
    @Autowired ReservedBoysBestsellersScrapper reservedBoysBestsellersScrapper;
    @Autowired ReservedBoysOutwearSweatersScrapper reservedBoysOutwearSweatersScrapper;
    @Autowired ReservedBoysTrousersJeansShortsScrapper reservedBoysTrousersJeansShortsScrapper;
    @Autowired ReservedBoysTshirtsShirtsScrapper reservedBoysTshirtsShirtsScrapper;
    @Autowired ReservedBoysUnderwearScrapper reservedBoysUnderwearScrapper;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(reservedBoysAccessoriesrScrapper.run(driver));
        products.addAll(reservedBoysBabyBoyScrapper.run(driver));
        products.addAll(reservedBoysBestsellersScrapper.run(driver));
        products.addAll(reservedBoysOutwearSweatersScrapper.run(driver));
        products.addAll(reservedBoysTrousersJeansShortsScrapper.run(driver));
        products.addAll(reservedBoysTshirtsShirtsScrapper.run(driver));
        products.addAll(reservedBoysUnderwearScrapper.run(driver));

        return products;
    }
}