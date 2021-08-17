package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.reserved.woman.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedWomenProductsSubRetriever implements SubRetriever {
    @Autowired
    ReservedWomanAccessoriesScrapper reservedWomanAccessoriesScrapper;
    @Autowired
    ReservedWomanBestsellersScrapper reservedWomanBestsellersScrapper;
    @Autowired
    ReservedWomanBlousesScrapper reservedWomanBlousesScrapper;
    @Autowired
    ReservedWomanDressesAndJumpsuitsScrapper reservedWomanDressesAndJumpsuitsScrapper;
    @Autowired
    ReservedWomanJacketsScrapper reservedWomanJacketsScrapper;
    @Autowired
    ReservedWomanJeansScrapper reservedWomanJeansScrapper;
    @Autowired
    ReservedWomanOutwearScrapper reservedWomanOutwearScrapper;
    @Autowired
    ReservedWomanShirtsScrapper reservedWomanShirtsScrapper;
    @Autowired
    ReservedWomanShortsScrapper reservedWomanShortsScrapper;
    @Autowired
    ReservedWomanSkirtsScrapper reservedWomanSkirtsScrapper;
    @Autowired
    ReservedWomanSweatersScrapper reservedWomanSweatersScrapper;
    @Autowired
    ReservedWomanSweatshirtsScrapper reservedWomanSweatshirtsScrapper;
    @Autowired
    ReservedWomanTrousersScrapper reservedWomanTrousersScrapper;
    @Autowired
    ReservedWomanTShirtsScrapper reservedWomanTShirtsScrapper;


    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomanAccessoriesScrapper.run(driver));
        products.addAll(reservedWomanBestsellersScrapper.run(driver));
        products.addAll(reservedWomanBlousesScrapper.run(driver));
        products.addAll(reservedWomanDressesAndJumpsuitsScrapper.run(driver));
        products.addAll(reservedWomanJacketsScrapper.run(driver));
        products.addAll(reservedWomanJeansScrapper.run(driver));
        products.addAll(reservedWomanOutwearScrapper.run(driver));
        products.addAll(reservedWomanShirtsScrapper.run(driver));
        products.addAll(reservedWomanShortsScrapper.run(driver));
        products.addAll(reservedWomanSkirtsScrapper.run(driver));
        products.addAll(reservedWomanSweatersScrapper.run(driver));
        products.addAll(reservedWomanSweatshirtsScrapper.run(driver));
        products.addAll(reservedWomanTrousersScrapper.run(driver));
        products.addAll(reservedWomanTShirtsScrapper.run(driver));

        return products;
    }
}
