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
public class ReservedGirlsProductsSubRetriever implements SubRetriever {
    private final ReservedGirlsAccessoriesScrapper reservedGirlsAccessoriesScrapper;
    private final ReservedGirlsBestsellersScrapper reservedGirlsBestsellersScrapper;
    private final ReservedGirlsBlousesTShirtsScrapper reservedGirlsBlousesTShirtsScrapper;
    private final ReservedGirlsDressesScrapper reservedGirlsDressesScrapper;
    private final ReservedGirlsOutwearSweatersScrapper reservedGirlsOutwearSweatersScrapper;
    private final ReservedGirlsSwimwearScrapper reservedGirlsSwimwearScrapper;
    private final ReservedGirlsTrousersJeansShortsScrapper reservedGirlsTrousersJeansShortsScrapper;

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
