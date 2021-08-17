package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.reserved.man.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedMenProductsSubRetriever implements SubRetriever {
    @Autowired
    ReservedManAccessoriesScrapper reservedManAccessoriesScrapper;
    @Autowired
    ReservedManBestsellersScrapper reservedManBestsellersScrapper;
    @Autowired
    ReservedManOutwearScrapper reservedManOutwearScrapper;
    @Autowired
    ReservedManShirtsScrapper reservedManShirtsScrapper;
    @Autowired
    ReservedManShoesScrapper reservedManShoesScrapper;
    @Autowired
    ReservedManShortsScrapper reservedManShortsScrapper;
    @Autowired
    ReservedManSweatshirtsScrapper reservedManSweatshirtsScrapper;
    @Autowired
    ReservedManTrousersScrapper reservedManTrousersScrapper;
    @Autowired
    ReservedManTShirtsScrapper reservedManTShirtsScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(reservedManAccessoriesScrapper.run(driver));
        products.addAll(reservedManBestsellersScrapper.run(driver));
        products.addAll(reservedManOutwearScrapper.run(driver));
        products.addAll(reservedManShirtsScrapper.run(driver));
        products.addAll(reservedManShoesScrapper.run(driver));
        products.addAll(reservedManShortsScrapper.run(driver));
        products.addAll(reservedManSweatshirtsScrapper.run(driver));
        products.addAll(reservedManTrousersScrapper.run(driver));
        products.addAll(reservedManTShirtsScrapper.run(driver));

        return products;
    }
}
