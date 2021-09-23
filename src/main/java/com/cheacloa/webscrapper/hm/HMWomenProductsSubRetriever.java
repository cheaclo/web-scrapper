package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.hm.woman.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HMWomenProductsSubRetriever implements SubRetriever {
    private final HMWomanAccessoriesScrapper accessoriesScrapper;
    private final HMWomanDivideScrapper divideScrapper;
    private final HMWomanTrendsScrapper trendsScrapper;
    private final HMWomanDressesScrapper dressesScrapper;
    private final HMWomanSwimwearScrapper swimwearScrapper;
    private final HMWomanShirtsAndBlousesScrapper shirtsAndBlousesScrapper;
    private final HMWomanTopsScrapper topsScrapper;
    private final HMWomanKnitwearScrapper knitwearScrapper;
    private final HMWomanCardigansAndJumpers cardigansAndJumpers;
    private final HMWomanBlazersAndWaistcoatsScrapper blazersAndWaistcoatsScrapper;
    private final HMWomanJacketsAndCoatsScrapper jacketsAndCoatsScrapper;
    private final HMWomanSweatshirtsAndHoodiesScrapper sweatshirtsAndHoodiesScrapper;
    private final HMWomanTrousersScrapper trousersScrapper;
    private final HMWomanJeansScrapper jeansScrapper;
    private final HMWomanJumpsuitsScrapper jumpsuitsScrapper;
    private final HMWomanSkirtsScrapper skirtsScrapper;
    private final HMWomanShoesScrapper shoesScrapper;
    private final HMWomanBasicsScrapper basicsScrapper;
    private final HMWomanLingerieScrapper lingerieScrapper;
    private final HMWomanNightwearAndLoungewearScrapper nightwearAndLoungewearScrapper;
    private final HMWomanShortsScrapper shortsScrapper;
    private final HMWomanSocksAndTightsScrapper socksAndTightsScrapper;
    private final HMWomanSportScrapper sportScrapper;
    private final HMWomanPlusScrapper plusScrapper;
    private final HMWomanMaternityWearScrapper maternityWearScrapper;
    private final HMWomanExtendedSizesScrapper extendedSizesScrapper;
    private final HMWomanPremiumSelectionScrapper premiumSelectionScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(accessoriesScrapper.run(driver));
        products.addAll(divideScrapper.run(driver));
        products.addAll(trendsScrapper.run(driver));
        products.addAll(dressesScrapper.run(driver));
        products.addAll(swimwearScrapper.run(driver));
        products.addAll(shirtsAndBlousesScrapper.run(driver));
        products.addAll(topsScrapper.run(driver));
        products.addAll(knitwearScrapper.run(driver));
        products.addAll(cardigansAndJumpers.run(driver));
        products.addAll(blazersAndWaistcoatsScrapper.run(driver));
        products.addAll(jacketsAndCoatsScrapper.run(driver));
        products.addAll(sweatshirtsAndHoodiesScrapper.run(driver));
        products.addAll(trousersScrapper.run(driver));
        products.addAll(jeansScrapper.run(driver));
        products.addAll(jumpsuitsScrapper.run(driver));
        products.addAll(skirtsScrapper.run(driver));
        products.addAll(shoesScrapper.run(driver));
        products.addAll(basicsScrapper.run(driver));
        products.addAll(lingerieScrapper.run(driver));
        products.addAll(nightwearAndLoungewearScrapper.run(driver));
        products.addAll(shortsScrapper.run(driver));
        products.addAll(socksAndTightsScrapper.run(driver));
        products.addAll(sportScrapper.run(driver));
        products.addAll(plusScrapper.run(driver));
        products.addAll(maternityWearScrapper.run(driver));
        products.addAll(extendedSizesScrapper.run(driver));
        products.addAll(premiumSelectionScrapper.run(driver));

        return products;
    }
}
