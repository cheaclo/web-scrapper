package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.SubRetriever;
import com.cheacloa.webscrapper.ca.man.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CAMenProductsSubRetriever implements SubRetriever {
    @Autowired
    CAManBusinessWearScrapper caManBusinessWearScrapper;
    @Autowired
    CAManCHAccessoriesScrapper caManCHAccessoriesScrapper;
    @Autowired
    CAManCHJacketsAndCoatsScrapper caManCHJacketsAndCoatsScrapper;
    @Autowired
    CAManCHJeansScrapper caManCHJeansScrapper;
    @Autowired
    CAManCHShirtsScrapper caManCHShirtsScrapper;
    @Autowired
    CAManCHShoesScrapper caManCHShoesScrapper;
    @Autowired
    CAManCHShortsScrapper caManCHShortsScrapper;
    @Autowired
    CAManCHSlippersScrapper caManCHSlippersScrapper;
    @Autowired
    CAManCHSweatshirtsScrapper caManCHSweatshirtsScrapper;
    @Autowired
    CAManCHTrousersScrapper caManCHTrousersScrapper;
    @Autowired
    CAManCHTShirtsScrapper caManCHTShirtsScrapper;
    @Autowired
    CAManJacketsAndCoatsScrapper caManJacketsAndCoatsScrapper;
    @Autowired
    CAManJeansScrapper caManJeansScrapper;
    @Autowired
    CAManJumpersAndCardigansScrapper caManJumpersAndCardigansScrapper;
    @Autowired
    CAManLargeSizesScrapper caManLargeSizesScrapper;
    @Autowired
    CAManShirtsScrapper caManShirtsScrapper;
    @Autowired
    CAManShortsScrapper caManShortsScrapper;
    @Autowired
    CAManSocksScrapper caManSocksScrapper;
    @Autowired
    CAManSweatshirtsAndSweatJacketsScrapper caManSweatshirtsAndSweatJacketsScrapper;
    @Autowired
    CAManTrousersScrapper caManTrousersScrapper;
    @Autowired
    CAManTShirtsAndPoloScrapper caManTShirtsAndPoloScrapper;
    @Autowired
    CAManUnderwearAndNightwearScrapper caManUnderwearAndNightwearScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(caManBusinessWearScrapper.run(driver));
        products.addAll(caManCHAccessoriesScrapper.run(driver));
        products.addAll(caManCHJacketsAndCoatsScrapper.run(driver));
        products.addAll(caManCHJeansScrapper.run(driver));
        products.addAll(caManCHShirtsScrapper.run(driver));
        products.addAll(caManCHShoesScrapper.run(driver));
        products.addAll(caManCHShortsScrapper.run(driver));
        products.addAll(caManCHSlippersScrapper.run(driver));
        products.addAll(caManCHSweatshirtsScrapper.run(driver));
        products.addAll(caManCHTrousersScrapper.run(driver));
        products.addAll(caManCHTShirtsScrapper.run(driver));
        products.addAll(caManJacketsAndCoatsScrapper.run(driver));
        products.addAll(caManJeansScrapper.run(driver));
        products.addAll(caManJumpersAndCardigansScrapper.run(driver));
        products.addAll(caManLargeSizesScrapper.run(driver));
        products.addAll(caManShirtsScrapper.run(driver));
        products.addAll(caManShortsScrapper.run(driver));
        products.addAll(caManSocksScrapper.run(driver));
        products.addAll(caManSweatshirtsAndSweatJacketsScrapper.run(driver));
        products.addAll(caManTrousersScrapper.run(driver));
        products.addAll(caManTShirtsAndPoloScrapper.run(driver));
        products.addAll(caManUnderwearAndNightwearScrapper.run(driver));

        return products;
    }
}
