package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.hm.kid.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMKidsProductsSubRetriever implements SubRetriever {
    @Autowired
    HMGirlsAccessoriesScrapper hmGirlsAccessoriesScrapper;
    @Autowired
    HMGirlsDressesScrapper hmGirlsDressesScrapper;
    @Autowired
    HMGirlsFancyScrapper hmGirlsFancyScrapper;
    @Autowired
    HMGirlsJumpersAndSweatshirtsScrapper hmGirlsJumpersAndSweatshirtsScrapper;
    @Autowired
    HMGirlsJumpsuitsAndPlaysuitsScrapper hmGirlsJumpsuitsAndPlaysuitsScrapper;
    @Autowired
    HMGirlsNightwearScrapper hmGirlsNightwearScrapper;
    @Autowired
    HMGirlsOutwearScrapper hmGirlsOutwearScrapper;
    @Autowired
    HMGirlsSetsAndOutfitsScrapper hmGirlsSetsAndOutfitsScrapper;
    @Autowired
    HMGirlsShoesScrapper hmGirlsShoesScrapper;
    @Autowired
    HMGirlsSkirtsScrapper hmGirlsSkirtsScrapper;
    @Autowired
    HMGirlsSocksScrapper hmGirlsSocksScrapper;
    @Autowired
    HMGirlsSportwearScrapper hmGirlsSportwearScrapper;
    @Autowired
    HMGirlsSwimwearScrapper hmGirlsSwimwearScrapper;
    @Autowired
    HMGirlsTopsAndTShirtsScrapper hmGirlsTopsAndTShirtsScrapper;
    @Autowired
    HMGirlsTrousersAndJeansScrapper hmGirlsTrousersAndJeansScrapper;

    @Autowired
    HMBoysAccessoriesScrapper hmBoysAccessoriesScrapper;
    @Autowired
    HMBoysBlazersSuitsScrapper hmBoysBlazersSuitsScrapper;
    @Autowired
    HMBoysJumpersAndSweatshirtsScrapper hmBoysJumpersAndSweatshirtsScrapper;
    @Autowired
    HMBoysNightwearScrapper hmBoysNightwearScrapper;
    @Autowired
    HMBoysOutwearsScrapper hmBoysOutwearsScrapper;
    @Autowired
    HMBoysSetsAndOutfitsScrapper hmBoysSetsAndOutfitsScrapper;
    @Autowired
    HMBoysShoesScrapper hmBoysShoesScrapper;
    @Autowired
    HMBoysShortsScrapper hmBoysShortsScrapper;
    @Autowired
    HMBoysSwimwearScrapper hmBoysSwimwearScrapper;
    @Autowired
    HMBoysTrousersAndJeansScrapper hmBoysTrousersAndJeansScrapper;
    @Autowired
    HMBoysTShirtsAndShirtsScrapper hmBoysTShirtsAndShirtsScrapper;
    @Autowired
    HMBoysUnderwearScrapper hmBoysUnderwearScrapper;

    @Autowired
    HMBabiesScrapper hmBabiesScrapper;

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

        products.addAll(hmBoysAccessoriesScrapper.run(driver));
        products.addAll(hmBoysBlazersSuitsScrapper.run(driver));
        products.addAll(hmBoysJumpersAndSweatshirtsScrapper.run(driver));
        products.addAll(hmBoysNightwearScrapper.run(driver));
        products.addAll(hmBoysOutwearsScrapper.run(driver));
        products.addAll(hmBoysSetsAndOutfitsScrapper.run(driver));
        products.addAll(hmBoysShoesScrapper.run(driver));
        products.addAll(hmBoysShortsScrapper.run(driver));
        products.addAll(hmBoysSwimwearScrapper.run(driver));
        products.addAll(hmBoysTrousersAndJeansScrapper.run(driver));
        products.addAll(hmBoysTShirtsAndShirtsScrapper.run(driver));
        products.addAll(hmBoysUnderwearScrapper.run(driver));

        products.addAll(hmBabiesScrapper.run(driver));

        return products;
    }
}
