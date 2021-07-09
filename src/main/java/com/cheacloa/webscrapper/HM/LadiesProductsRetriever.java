package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.woman.*;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LadiesProductsRetriever {
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
        List<Product> products = new ArrayList<>();

        products.addAll(accessoriesScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(divideScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(trendsScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(dressesScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(swimwearScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(shirtsAndBlousesScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(topsScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(knitwearScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(cardigansAndJumpers.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(blazersAndWaistcoatsScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(jacketsAndCoatsScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(sweatshirtsAndHoodiesScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(trousersScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(jeansScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(jumpsuitsScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(skirtsScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(shoesScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(basicsScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(lingerieScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(nightwearAndLoungewearScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(shortsScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(socksAndTightsScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(sportScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(plusScrapper.run(driver)); System.out.println(products.size()); //LOG\
        products.addAll(maternityWearScrapper.run(driver)); System.out.println(products.size());  //LOG
        products.addAll(extendedSizesScrapper.run(driver)); System.out.println(products.size()); //LOG
        products.addAll(premiumSelectionScrapper.run(driver)); System.out.println(products.size()); //LOG

        return products;
    }
}
