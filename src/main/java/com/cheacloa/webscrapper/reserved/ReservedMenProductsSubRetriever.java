package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.reserved.man.*;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ReservedMenProductsSubRetriever implements SubRetriever {
    private final ReservedManAccessoriesScrapper reservedManAccessoriesScrapper;
    private final ReservedManBestsellersScrapper reservedManBestsellersScrapper;
    private final ReservedManOutwearScrapper reservedManOutwearScrapper;
    private final ReservedManShirtsScrapper reservedManShirtsScrapper;
    private final ReservedManShoesScrapper reservedManShoesScrapper;
    private final ReservedManShortsScrapper reservedManShortsScrapper;
    private final ReservedManSweatshirtsScrapper reservedManSweatshirtsScrapper;
    private final ReservedManTrousersScrapper reservedManTrousersScrapper;
    private final ReservedManTShirtsScrapper reservedManTShirtsScrapper;

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
