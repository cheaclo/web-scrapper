package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.reserved.kid.*;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ReservedBoysProductsSubRetriever implements SubRetriever {
    private final ReservedBoysAccessoriesScrapper reservedBoysAccessoriesrScrapper;
    private final ReservedBoysBabyBoyScrapper reservedBoysBabyBoyScrapper;
    private final ReservedBoysBestsellersScrapper reservedBoysBestsellersScrapper;
    private final ReservedBoysOutwearSweatersScrapper reservedBoysOutwearSweatersScrapper;
    private final ReservedBoysTrousersJeansShortsScrapper reservedBoysTrousersJeansShortsScrapper;
    private final ReservedBoysTshirtsShirtsScrapper reservedBoysTshirtsShirtsScrapper;
    private final ReservedBoysUnderwearScrapper reservedBoysUnderwearScrapper;

    @Override
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
