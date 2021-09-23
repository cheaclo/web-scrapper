package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.ca.woman.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CAWomenProductsSubRetriever implements SubRetriever {
    private final CAWomanBlousesScrapper caWomanBlousesScrapper;
    private final CAWomanBusinessWearScrapper caWomanBusinessWearScrapper;
    private final CAWomanDressesAndJumpsuitsScrapper caWomanDressesAndJumpsuitsScrapper;
    private final CAWomanEveningWearScrapper caWomanEveningWearScrapper;
    private final CAWomanJacketsAndCoatsScrapper caWomanJacketsAndCoatsScrapper;
    private final CAWomanJeansScrapper caWomanJeansScrapper;
    private final CAWomanJumpersAndCardigansScrapper caWomanJumpersAndCardigansScrapper;
    private final CAWomanNightwearScrapper caWomanNightwearScrapper;
    private final CAWomanShirtsAndTopsScrapper caWomanShirtsAndTopsScrapper;
    private final CAWomanSkirtsScrapper caWomanSkirtsScrapper;
    private final CAWomanSocksAndTightsScrapper caWomanSocksAndTightsScrapper;
    private final CAWomanSportswearScrapper caWomanSportswearScrapper;
    private final CAWomanSweatshirtsScrapper caWomanSweatshirtsScrapper;
    private final CAWomanSwimwearScrapper caWomanSwimwearScrapper;
    private final CAWomanTrousersScrapper caWomanTrousersScrapper;
    private final CAWomanUnderwearScrapper caWomanUnderwearScrapper;


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
