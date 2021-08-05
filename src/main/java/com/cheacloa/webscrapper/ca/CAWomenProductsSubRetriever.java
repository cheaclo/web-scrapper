package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.ca.woman.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CAWomenProductsSubRetriever implements SubRetriever {
    @Autowired
    CAWomanBlousesScrapper caWomanBlousesScrapper;
    @Autowired
    CAWomanBusinessWearScrapper caWomanBusinessWearScrapper;
    @Autowired
    CAWomanDressesAndJumpsuitsScrapper caWomanDressesAndJumpsuitsScrapper;
    @Autowired
    CAWomanEveningWearScrapper caWomanEveningWearScrapper;
    @Autowired
    CAWomanJacketsAndCoatsScrapper caWomanJacketsAndCoatsScrapper;
    @Autowired
    CAWomanJeansScrapper caWomanJeansScrapper;
    @Autowired
    CAWomanJumpersAndCardigansScrapper caWomanJumpersAndCardigansScrapper;
    @Autowired
    CAWomanNightwearScrapper caWomanNightwearScrapper;
    @Autowired
    CAWomanShirtsAndTopsScrapper caWomanShirtsAndTopsScrapper;
    @Autowired
    CAWomanSkirtsScrapper caWomanSkirtsScrapper;
    @Autowired
    CAWomanSocksAndTightsScrapper caWomanSocksAndTightsScrapper;
    @Autowired
    CAWomanSportswearScrapper caWomanSportswearScrapper;
    @Autowired
    CAWomanSweatshirtsScrapper caWomanSweatshirtsScrapper;
    @Autowired
    CAWomanSwimwearScrapper caWomanSwimwearScrapper;
    @Autowired
    CAWomanTrousersScrapper caWomanTrousersScrapper;
    @Autowired
    CAWomanUnderwearScrapper caWomanUnderwearScrapper;


    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(caWomanBlousesScrapper.run(driver));
        products.addAll(caWomanBusinessWearScrapper.run(driver));
        products.addAll(caWomanDressesAndJumpsuitsScrapper.run(driver));
        products.addAll(caWomanEveningWearScrapper.run(driver));
        products.addAll(caWomanJacketsAndCoatsScrapper.run(driver));
        products.addAll(caWomanJeansScrapper.run(driver));
        products.addAll(caWomanJumpersAndCardigansScrapper.run(driver));
        products.addAll(caWomanNightwearScrapper.run(driver));
        products.addAll(caWomanShirtsAndTopsScrapper.run(driver));
        products.addAll(caWomanSkirtsScrapper.run(driver));
        products.addAll(caWomanSocksAndTightsScrapper.run(driver));
        products.addAll(caWomanSportswearScrapper.run(driver));
        products.addAll(caWomanSweatshirtsScrapper.run(driver));
        products.addAll(caWomanSwimwearScrapper.run(driver));
        products.addAll(caWomanTrousersScrapper.run(driver));
        products.addAll(caWomanUnderwearScrapper.run(driver));

        return products;
    }
}
