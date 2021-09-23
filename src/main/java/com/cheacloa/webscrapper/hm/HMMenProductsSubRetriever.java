package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.hm.man.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HMMenProductsSubRetriever implements SubRetriever {
    private final HMManHoodiesAndSweatshirtsScrapper hmManHoodiesAndSweatshirtsScrapper;
    private final HMManTShirtsAndTanksScrapper hmManTShirtsAndTanksScrapper;
    private final HMManShirtsScrapper hmManShirtsScrapper;
    private final HMManTrousersScrapper hmManTrousersScrapper;
    private final HMManShortsScrapper hmManShortsScrapper;
    private final HMManSwimwearScrapper hmManSwimwearScrapper;
    private final HMManJeansScrapper hmManJeansScrapper;
    private final HMManBlazersAndSuitsScrapper hmManBlazersAndSuitsScrapper;
    private final HMManNightwearAndLoungewearScrapper hmManNightwearAndLoungewearScrapper;
    private final HMManAccessoriesScrapper hmManAccessoriesScrapper;
    private final HMManExtendedSizesScrapper hmManExtendedSizesScrapper;
    private final HMManSportswearScrapper hmManSportswearScrapper;
    private final HMManSocksScrapper hmManSocksScrapper;
    private final HMManBasicsScrapper hmManBasicsScrapper;
    private final HMManPremiumSelectionScrapper hmManPremiumSelectionScrapper;

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
