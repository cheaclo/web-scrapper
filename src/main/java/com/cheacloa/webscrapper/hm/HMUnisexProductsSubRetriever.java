package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.hm.unisex.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HMUnisexProductsSubRetriever implements SubRetriever {
    private final HMUnisexLastChanceScrapper lastChanceScrapper;
    private final HMUnisexDressesScrapper dressesScrapper;
    private final HMUnisexShirtsAndBlouesesScrapper shirtsAndBlouesesScrapper;
    private final HMUnisexTopsScrapper hmUnisexTopsScrapper;
    private final HMUnisexCardigansAndJumpersScrapper hmUnisexCardagiansAndJumpersScrapper;
    private final HMUnisexHoodiesAndSweatshirtsScrapper hmUnisexHoodiesAndSweatshirtsScrapper;
    private final HMUnisexJacketsAndCoatsScrapper hmUnisexJacketsAndCoatsScrapper;
    private final HMUnisexJeansScrapper hmUnisexJeansScrapper;
    private final HMUnisexTrousersAndLeggingsScrapper hmUnisexTrousersAndLeggingsScrapper;
    private final HMUnisexJumpsuitsAndRompersScrapper hmUnisexJumpsuitsAndRompersScrapper;
    private final HMUnisexSkirtsScrapper hmUnisexSkirtsScrapper;
    private final HMUnisexSwimwearScrapper hmUnisexSwimwearScrapper;
    private final HMUnisexShoesScrapper hmUnisexShoesScrapper;
    private final HMUnisexAccessoriesScrapper hmUnisexAccessoriesScrapper;
    private final HMUnisexBasicsScrapper hmUnisexBasicsScrapper;
    private final HMUnisexShortsScrapper hmUnisexShortsScrapper;
    private final HMUnisexUnderwearAndNightwearScrapper hmUnisexUnderwearAndNightwearScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(lastChanceScrapper.run(driver));
        products.addAll(dressesScrapper.run(driver));
        products.addAll(shirtsAndBlouesesScrapper.run(driver));
        products.addAll(hmUnisexTopsScrapper.run(driver));
        products.addAll(hmUnisexCardagiansAndJumpersScrapper.run(driver));
        products.addAll(hmUnisexHoodiesAndSweatshirtsScrapper.run(driver));
        products.addAll(hmUnisexJacketsAndCoatsScrapper.run(driver));
        products.addAll(hmUnisexTrousersAndLeggingsScrapper.run(driver));
        products.addAll(hmUnisexJumpsuitsAndRompersScrapper.run(driver));
        products.addAll(hmUnisexSkirtsScrapper.run(driver));
        products.addAll(hmUnisexSwimwearScrapper.run(driver));
        products.addAll(hmUnisexShoesScrapper.run(driver));
        products.addAll(hmUnisexAccessoriesScrapper.run(driver));
        products.addAll(hmUnisexBasicsScrapper.run(driver));
        products.addAll(hmUnisexShortsScrapper.run(driver));
        products.addAll(hmUnisexUnderwearAndNightwearScrapper.run(driver));

        return products;
    }
}
