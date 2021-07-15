package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.unisex.*;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMUnisexProductsRetriever implements Retriever {
    @Autowired HMUnisexLastChanceScrapper lastChanceScrapper;
    @Autowired HMUnisexDressesScrapper dressesScrapper;
    @Autowired HMUnisexShirtsAndBlouesesScrapper shirtsAndBlouesesScrapper;
    @Autowired HMUnisexTopsScrapper hmUnisexTopsScrapper;
    @Autowired HMUnisexCardagiansAndJumpersScrapper hmUnisexCardagiansAndJumpersScrapper;
    @Autowired HMUnisexHoodiesAndSweatshirtsScrapper hmUnisexHoodiesAndSweatshirtsScrapper;
    @Autowired HMUnisexJacketsAndCoatsScrapper hmUnisexJacketsAndCoatsScrapper;
    @Autowired HMUnisexJeansScrapper hmUnisexJeansScrapper;
    @Autowired HMUnisexTrousersAndLeggingsScrapper hmUnisexTrousersAndLeggingsScrapper;
    @Autowired HMUnisexJumpsuitsAndRompersScrapper hmUnisexJumpsuitsAndRompersScrapper;
    @Autowired HMUnisexSkirtsScrapper hmUnisexSkirtsScrapper;
    @Autowired HMUnisexSwimwearScrapper hmUnisexSwimwearScrapper;
    @Autowired HMUnisexShoesScrapper hmUnisexShoesScrapper;
    @Autowired HMUnisexAccessoriesScrapper hmUnisexAccessoriesScrapper;
    @Autowired HMUnisexBasicsScrapper hmUnisexBasicsScrapper;
    @Autowired HMUnisexShortsScrapper hmUnisexShortsScrapper;
    @Autowired HMUnisexUnderwearAndNightwearScrapper hmUnisexUnderwearAndNightwearScrapper;

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
