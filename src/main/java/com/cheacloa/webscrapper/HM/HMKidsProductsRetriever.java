package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.kid.*;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMKidsProductsRetriever implements Retriever {
    @Autowired HMGirlsAccessoriesScrapper hmGirlsAccessoriesScrapper;
    @Autowired HMGirlsDressesScrapper hmGirlsDressesScrapper;
    @Autowired HMGirlsFancyScrapper hmGirlsFancyScrapper;
    @Autowired HMGirlsJumpersAndSweatshirtsScrapper hmGirlsJumpersAndSweatshirtsScrapper;
    @Autowired HMGirlsJumpsuitsAndPlaysuitsScrapper hmGirlsJumpsuitsAndPlaysuitsScrapper;
    @Autowired HMGirlsNightwearScrapper hmGirlsNightwearScrapper;
    @Autowired HMGirlsOutwearScrapper hmGirlsOutwearScrapper;
    @Autowired HMGirlsSetsAndOutfitsScrapper hmGirlsSetsAndOutfitsScrapper;
    @Autowired HMGirlsShoesScrapper hmGirlsShoesScrapper;
    @Autowired HMGirlsSkirtsScrapper hmGirlsSkirtsScrapper;
    @Autowired HMGirlsSocksScrapper hmGirlsSocksScrapper;
    @Autowired HMGirlsSportwearScrapper hmGirlsSportwearScrapper;
    @Autowired HMGirlsSwimwearScrapper hmGirlsSwimwearScrapper;
    @Autowired HMGirlsTopsAndTShirtsScrapper hmGirlsTopsAndTShirtsScrapper;
    @Autowired HMGirlsTrousersAndJeansScrapper hmGirlsTrousersAndJeansScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(hmGirlsAccessoriesScrapper.run(driver));
        products.addAll(hmGirlsDressesScrapper.run(driver));
        products.addAll(hmGirlsFancyScrapper.run(driver));
        products.addAll(hmGirlsJumpersAndSweatshirtsScrapper.run(driver));
        products.addAll(hmGirlsJumpsuitsAndPlaysuitsScrapper.run(driver));
        products.addAll(hmGirlsNightwearScrapper.run(driver));
        products.addAll(hmGirlsOutwearScrapper.run(driver));
        products.addAll(hmGirlsSetsAndOutfitsScrapper.run(driver));
        products.addAll(hmGirlsShoesScrapper.run(driver));
        products.addAll(hmGirlsSkirtsScrapper.run(driver));
        products.addAll(hmGirlsSocksScrapper.run(driver));
        products.addAll(hmGirlsSportwearScrapper.run(driver));
        products.addAll(hmGirlsSwimwearScrapper.run(driver));
        products.addAll(hmGirlsTopsAndTShirtsScrapper.run(driver));
        products.addAll(hmGirlsTrousersAndJeansScrapper.run(driver));

        return products;
    }
}
