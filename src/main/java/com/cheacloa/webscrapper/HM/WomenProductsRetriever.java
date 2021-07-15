package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.woman.*;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class WomenProductsRetriever {
    @Autowired private AccessoriesScrapper accessoriesScrapper;
    @Autowired private DivideScrapper divideScrapper;
    @Autowired private TrendsScrapper trendsScrapper;
    @Autowired private DressesScrapper dressesScrapper;
    @Autowired private SwimwearScrapper swimwearScrapper;
    @Autowired private ShirtsAndBlousesScrapper shirtsAndBlousesScrapper;
    @Autowired private TopsScrapper topsScrapper;
    @Autowired private KnitwearScrapper knitwearScrapper;
    @Autowired private CardigansAndJumpers cardigansAndJumpers;
    @Autowired private BlazersAndWaistcoatsScrapper blazersAndWaistcoatsScrapper;
    @Autowired private JacketsAndCoatsScrapper jacketsAndCoatsScrapper;
    @Autowired private SweatshirtsAndHoodiesScrapper sweatshirtsAndHoodiesScrapper;
    @Autowired private TrousersScrapper trousersScrapper;
    @Autowired private JeansScrapper jeansScrapper;
    @Autowired private JumpsuitsScrapper jumpsuitsScrapper;
    @Autowired private SkirtsScrapper skirtsScrapper;
    @Autowired private ShoesScrapper shoesScrapper;
    @Autowired private BasicsScrapper basicsScrapper;
    @Autowired private LingerieScrapper lingerieScrapper;
    @Autowired private NightwearAndLoungewearScrapper nightwearAndLoungewearScrapper;
    @Autowired private ShortsScrapper shortsScrapper;
    @Autowired private SocksAndTightsScrapper socksAndTightsScrapper;
    @Autowired private SportScrapper sportScrapper;
    @Autowired private PlusScrapper plusScrapper;
    @Autowired private MaternityWearScrapper maternityWearScrapper;
    @Autowired private ExtendedSizesScrapper extendedSizesScrapper;
    @Autowired private PremiumSelectionScrapper premiumSelectionScrapper;

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
