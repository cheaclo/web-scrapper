package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.hm.kid.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HMKidsProductsSubRetriever implements SubRetriever {
    private final HMGirlsAccessoriesScrapper hmGirlsAccessoriesScrapper;
    private final HMGirlsDressesScrapper hmGirlsDressesScrapper;
    private final HMGirlsFancyScrapper hmGirlsFancyScrapper;
    private final HMGirlsJumpersAndSweatshirtsScrapper hmGirlsJumpersAndSweatshirtsScrapper;
    private final HMGirlsJumpsuitsAndPlaysuitsScrapper hmGirlsJumpsuitsAndPlaysuitsScrapper;
    private final HMGirlsNightwearScrapper hmGirlsNightwearScrapper;
    private final HMGirlsOutwearScrapper hmGirlsOutwearScrapper;
    private final HMGirlsSetsAndOutfitsScrapper hmGirlsSetsAndOutfitsScrapper;
    private final HMGirlsShoesScrapper hmGirlsShoesScrapper;
    private final HMGirlsSkirtsScrapper hmGirlsSkirtsScrapper;
    private final HMGirlsSocksScrapper hmGirlsSocksScrapper;
    private final HMGirlsSportswearScrapper hmGirlsSportwearScrapper;
    private final HMGirlsSwimwearScrapper hmGirlsSwimwearScrapper;
    private final HMGirlsTopsAndTShirtsScrapper hmGirlsTopsAndTShirtsScrapper;
    private final HMGirlsTrousersAndJeansScrapper hmGirlsTrousersAndJeansScrapper;

    private final HMBoysAccessoriesScrapper hmBoysAccessoriesScrapper;
    private final HMBoysBlazersSuitsScrapper hmBoysBlazersSuitsScrapper;
    private final HMBoysJumpersAndSweatshirtsScrapper hmBoysJumpersAndSweatshirtsScrapper;
    private final HMBoysNightwearScrapper hmBoysNightwearScrapper;
    private final HMBoysOutwearsScrapper hmBoysOutwearsScrapper;
    private final HMBoysSetsAndOutfitsScrapper hmBoysSetsAndOutfitsScrapper;
    private final HMBoysShoesScrapper hmBoysShoesScrapper;
    private final HMBoysShortsScrapper hmBoysShortsScrapper;
    private final HMBoysSwimwearScrapper hmBoysSwimwearScrapper;
    private final HMBoysTrousersAndJeansScrapper hmBoysTrousersAndJeansScrapper;
    private final HMBoysTShirtsAndShirtsScrapper hmBoysTShirtsAndShirtsScrapper;
    private final HMBoysUnderwearScrapper hmBoysUnderwearScrapper;

    private final HMBabiesScrapper hmBabiesScrapper;

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
