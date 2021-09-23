package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.reserved.woman.*;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ReservedWomenProductsSubRetriever implements SubRetriever {
    private final ReservedWomanAccessoriesScrapper reservedWomanAccessoriesScrapper;
    private final ReservedWomanBestsellersScrapper reservedWomanBestsellersScrapper;
    private final ReservedWomanBlousesScrapper reservedWomanBlousesScrapper;
    private final ReservedWomanDressesAndJumpsuitsScrapper reservedWomanDressesAndJumpsuitsScrapper;
    private final ReservedWomanJacketsScrapper reservedWomanJacketsScrapper;
    private final ReservedWomanJeansScrapper reservedWomanJeansScrapper;
    private final ReservedWomanOutwearScrapper reservedWomanOutwearScrapper;
    private final ReservedWomanShirtsScrapper reservedWomanShirtsScrapper;
    private final ReservedWomanShortsScrapper reservedWomanShortsScrapper;
    private final ReservedWomanSkirtsScrapper reservedWomanSkirtsScrapper;
    private final ReservedWomanSweatersScrapper reservedWomanSweatersScrapper;
    private final ReservedWomanSweatshirtsScrapper reservedWomanSweatshirtsScrapper;
    private final ReservedWomanTrousersScrapper reservedWomanTrousersScrapper;
    private final ReservedWomanTShirtsScrapper reservedWomanTShirtsScrapper;


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
