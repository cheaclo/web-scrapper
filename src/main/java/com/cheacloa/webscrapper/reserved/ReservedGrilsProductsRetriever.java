package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.Retriever;
import com.cheacloa.webscrapper.reserved.kid.*;
import com.cheacloa.webscrapper.reserved.man.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedGrilsProductsRetriever implements Retriever {
    @Autowired ReservedGirlsAccessoriesScrapper reservedGirlsAccessoriesScrapper;
    @Autowired ReservedGirlsBestsellersScrapper reservedGirlsBestsellersScrapper;
    @Autowired ReservedGirlsBlousesTShirtsScrapper reservedGirlsBlousesTShirtsScrapper;
    @Autowired ReservedGirlsDressesScrapper reservedGirlsDressesScrapper;
    @Autowired ReservedGirlsOutwearSweatersScrapper reservedGirlsOutwearSweatersScrapper;
    @Autowired ReservedGirlsSwimwearScrapper reservedGirlsSwimwearScrapper;
    @Autowired ReservedGirlsTrousersJeansShortsScrapper reservedGirlsTrousersJeansShortsScrapper;

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
