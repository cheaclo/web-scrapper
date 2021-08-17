package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.reserved.kid.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedGrilsProductsSubRetriever implements SubRetriever {
    @Autowired
    ReservedGirlsAccessoriesScrapper reservedGirlsAccessoriesScrapper;
    @Autowired
    ReservedGirlsBestsellersScrapper reservedGirlsBestsellersScrapper;
    @Autowired
    ReservedGirlsBlousesTShirtsScrapper reservedGirlsBlousesTShirtsScrapper;
    @Autowired
    ReservedGirlsDressesScrapper reservedGirlsDressesScrapper;
    @Autowired
    ReservedGirlsOutwearSweatersScrapper reservedGirlsOutwearSweatersScrapper;
    @Autowired
    ReservedGirlsSwimwearScrapper reservedGirlsSwimwearScrapper;
    @Autowired
    ReservedGirlsTrousersJeansShortsScrapper reservedGirlsTrousersJeansShortsScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(reservedGirlsAccessoriesScrapper.run(driver));
        products.addAll(reservedGirlsBestsellersScrapper.run(driver));
        products.addAll(reservedGirlsBlousesTShirtsScrapper.run(driver));
        products.addAll(reservedGirlsDressesScrapper.run(driver));
        products.addAll(reservedGirlsOutwearSweatersScrapper.run(driver));
        products.addAll(reservedGirlsSwimwearScrapper.run(driver));
        products.addAll(reservedGirlsTrousersJeansShortsScrapper.run(driver));

        return products;
    }
}
