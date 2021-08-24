package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.hm.woman.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMWomenProductsSubRetriever implements SubRetriever {
    @Autowired
    private HMWomanAccessoriesScrapper accessoriesScrapper;
    @Autowired
    private HMWomanDivideScrapper divideScrapper;
    @Autowired
    private HMWomanTrendsScrapper trendsScrapper;
    @Autowired
    private HMWomanDressesScrapper dressesScrapper;
    @Autowired
    private HMWomanSwimwearScrapper swimwearScrapper;
    @Autowired
    private HMWomanShirtsAndBlousesScrapper shirtsAndBlousesScrapper;
    @Autowired
    private HMWomanTopsScrapper topsScrapper;
    @Autowired
    private HMWomanKnitwearScrapper knitwearScrapper;
    @Autowired
    private HMWomanCardigansAndJumpers cardigansAndJumpers;
    @Autowired
    private HMWomanBlazersAndWaistcoatsScrapper blazersAndWaistcoatsScrapper;
    @Autowired
    private HMWomanJacketsAndCoatsScrapper jacketsAndCoatsScrapper;
    @Autowired
    private HMWomanSweatshirtsAndHoodiesScrapper sweatshirtsAndHoodiesScrapper;
    @Autowired
    private HMWomanTrousersScrapper trousersScrapper;
    @Autowired
    private HMWomanJeansScrapper jeansScrapper;
    @Autowired
    private HMWomanJumpsuitsScrapper jumpsuitsScrapper;
    @Autowired
    private HMWomanSkirtsScrapper skirtsScrapper;
    @Autowired
    private HMWomanShoesScrapper shoesScrapper;
    @Autowired
    private HMWomanBasicsScrapper basicsScrapper;
    @Autowired
    private HMWomanLingerieScrapper lingerieScrapper;
    @Autowired
    private HMWomanNightwearAndLoungewearScrapper nightwearAndLoungewearScrapper;
    @Autowired
    private HMWomanShortsScrapper shortsScrapper;
    @Autowired
    private HMWomanSocksAndTightsScrapper socksAndTightsScrapper;
    @Autowired
    private HMWomanSportScrapper sportScrapper;
    @Autowired
    private HMWomanPlusScrapper plusScrapper;
    @Autowired
    private HMWomanMaternityWearScrapper maternityWearScrapper;
    @Autowired
    private HMWomanExtendedSizesScrapper extendedSizesScrapper;
    @Autowired
    private HMWomanPremiumSelectionScrapper premiumSelectionScrapper;

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
