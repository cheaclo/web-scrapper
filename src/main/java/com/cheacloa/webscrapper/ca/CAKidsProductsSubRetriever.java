package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.ca.kids.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CAKidsProductsSubRetriever implements SubRetriever {
    private final CABabiesClothingScrapper caBabiesClothingScrapper;
    private final CABabiesNewbornScrapper caBabiesNewbornScrapper;
    private final CAKidAccessoriesSocksShoesScrapper caKidAccessoriesSocksShoesScrapper;
    private final CAKidBottomsScrapper caKidBottomsScrapper;
    private final CAKidComicsAndBrandsScrapper caKidComicsAndBrandsScrapper;
    private final CAKidDressesAndOutfitsScrapper caKidDressesAndOutfitsScrapper;
    private final CAKidJacketsAndCoatsScrapper caKidJacketsAndCoatsScrapper;
    private final CAKidNightwearAndUnderwearScrapper caKidNightwearAndUnderwearScrapper;
    private final CAKidSwimwearScrapper caKidSwimwearScrapper;
    private final CAKidTopsScrapper caKidTopsScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(caBabiesClothingScrapper.run(driver));
        products.addAll(caBabiesNewbornScrapper.run(driver));
        products.addAll(caKidAccessoriesSocksShoesScrapper.run(driver));
        products.addAll(caKidBottomsScrapper.run(driver));
        products.addAll(caKidComicsAndBrandsScrapper.run(driver));
        products.addAll(caKidDressesAndOutfitsScrapper.run(driver));
        products.addAll(caKidJacketsAndCoatsScrapper.run(driver));
        products.addAll(caKidNightwearAndUnderwearScrapper.run(driver));
        products.addAll(caKidSwimwearScrapper.run(driver));
        products.addAll(caKidTopsScrapper.run(driver));

        return products;
    }
}
