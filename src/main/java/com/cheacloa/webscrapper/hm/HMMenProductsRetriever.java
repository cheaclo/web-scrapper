package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.Retriever;
import com.cheacloa.webscrapper.hm.man.*;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMMenProductsRetriever implements Retriever {
    @Autowired HMManHoodiesAndSweatshirtsScrapper hmManHoodiesAndSweatshirtsScrapper;
    @Autowired HMManTShirtsAndTanksScrapper hmManTShirtsAndTanksScrapper;
    @Autowired HMManShirtsScrapper hmManShirtsScrapper;
    @Autowired HMManTrousersScrapper hmManTrousersScrapper;
    @Autowired HMManShortsScrapper hmManShortsScrapper;
    @Autowired HMManSwimwearScrapper hmManSwimwearScrapper;
    @Autowired HMManJeansScrapper hmManJeansScrapper;
    @Autowired HMManBlazersAndSuitsScrapper hmManBlazersAndSuitsScrapper;
    @Autowired HMManNightwearAndLoungewearScrapper hmManNightwearAndLoungewearScrapper;
    @Autowired HMManAccessoriesScrapper hmManAccessoriesScrapper;
    @Autowired HMManExtendedSizesScrapper hmManExtendedSizesScrapper;
    @Autowired HMManSportswearScrapper hmManSportswearScrapper;
    @Autowired HMManSocksScrapper hmManSocksScrapper;
    @Autowired HMManBasicsScrapper hmManBasicsScrapper;
    @Autowired HMManPremiumSelectionScrapper hmManPremiumSelectionScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(hmManHoodiesAndSweatshirtsScrapper.run(driver));
        products.addAll(hmManTShirtsAndTanksScrapper.run(driver));
        products.addAll(hmManShirtsScrapper.run(driver));
        products.addAll(hmManTrousersScrapper.run(driver));
        products.addAll(hmManShortsScrapper.run(driver));
        products.addAll(hmManSwimwearScrapper.run(driver));
        products.addAll(hmManJeansScrapper.run(driver));
        products.addAll(hmManBlazersAndSuitsScrapper.run(driver));
        products.addAll(hmManNightwearAndLoungewearScrapper.run(driver));
        products.addAll(hmManAccessoriesScrapper.run(driver));
        products.addAll(hmManExtendedSizesScrapper.run(driver));
        products.addAll(hmManSportswearScrapper.run(driver));
        products.addAll(hmManSocksScrapper.run(driver));
        products.addAll(hmManBasicsScrapper.run(driver));
        products.addAll(hmManPremiumSelectionScrapper.run(driver));

        return products;
    }
}
