package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.ca.man.*;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.service.SubRetriever;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CAMenProductsSubRetriever implements SubRetriever {
    private final CAManBusinessWearScrapper caManBusinessWearScrapper;
    private final CAManCHAccessoriesScrapper caManCHAccessoriesScrapper;
    private final CAManCHJacketsAndCoatsScrapper caManCHJacketsAndCoatsScrapper;
    private final CAManCHJeansScrapper caManCHJeansScrapper;
    private final CAManCHShirtsScrapper caManCHShirtsScrapper;
    private final CAManCHShoesScrapper caManCHShoesScrapper;
    private final CAManCHShortsScrapper caManCHShortsScrapper;
    private final CAManCHSlippersScrapper caManCHSlippersScrapper;
    private final CAManCHSweatshirtsScrapper caManCHSweatshirtsScrapper;
    private final CAManCHTrousersScrapper caManCHTrousersScrapper;
    private final CAManCHTShirtsScrapper caManCHTShirtsScrapper;
    private final CAManJacketsAndCoatsScrapper caManJacketsAndCoatsScrapper;
    private final CAManJeansScrapper caManJeansScrapper;
    private final CAManJumpersAndCardigansScrapper caManJumpersAndCardigansScrapper;
    private final CAManLargeSizesScrapper caManLargeSizesScrapper;
    private final CAManShirtsScrapper caManShirtsScrapper;
    private final CAManShortsScrapper caManShortsScrapper;
    private final CAManSocksScrapper caManSocksScrapper;
    private final CAManSweatshirtsAndSweatJacketsScrapper caManSweatshirtsAndSweatJacketsScrapper;
    private final CAManTrousersScrapper caManTrousersScrapper;
    private final CAManTShirtsAndPoloScrapper caManTShirtsAndPoloScrapper;
    private final CAManUnderwearAndNightwearScrapper caManUnderwearAndNightwearScrapper;

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
