package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.ca.kids.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CAKidsProductsSubRetriever implements SubRetriever {
    @Autowired
    CABabiesClothingScrapper caBabiesClothingScrapper;
    @Autowired
    CABabiesNewbornScrapper caBabiesNewbornScrapper;
    @Autowired
    CAKidAccessoriesSocksShoesScrapper caKidAccessoriesSocksShoesScrapper;
    @Autowired
    CAKidBottomsScrapper caKidBottomsScrapper;
    @Autowired
    CAKidComicsAndBrandsScrapper caKidComicsAndBrandsScrapper;
    @Autowired
    CAKidDressesAndOutfitsScrapper caKidDressesAndOutfitsScrapper;
    @Autowired
    CAKidJacketsAndCoatsScrapper caKidJacketsAndCoatsScrapper;
    @Autowired
    CAKidNightwearAndUnderwearScrapper caKidNightwearAndUnderwearScrapper;
    @Autowired
    CAKidSwimwearScrapper caKidSwimwearScrapper;
    @Autowired
    CAKidTopsScrapper caKidTopsScrapper;

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
