package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.unisex.HMUnisexDressesScrapper;
import com.cheacloa.webscrapper.HM.unisex.HMUnisexLastChanceScrapper;
import com.cheacloa.webscrapper.HM.unisex.HMUnisexShirtsAndBlouesesScrapper;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class HMUnisexProductsRetriever implements Retriever {
    @Autowired
    HMUnisexLastChanceScrapper lastChanceScrapper;
    @Autowired
    HMUnisexDressesScrapper dressesScrapper;
    @Autowired
    HMUnisexShirtsAndBlouesesScrapper shirtsAndBlouesesScrapper;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(lastChanceScrapper.run(driver));
        products.addAll(dressesScrapper.run(driver));
        products.addAll(shirtsAndBlouesesScrapper.run(driver));

        return products;
    }
}
