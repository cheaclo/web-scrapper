package com.cheacloa.webscrapper.mango;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.Retriever;
import com.cheacloa.webscrapper.mango.woman.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class MangoWomenProductsRetriever implements Retriever {
    @Autowired MangoWomanBagsScrapper mangoWomanBagsScrapper;
    @Autowired MangoWomanBeltsScrapper mangoWomanBeltsScrapper;
    @Autowired MangoWomanCardagiansAndSweatersScrapper mangoWomanCardagiansAndSweatersScrapper;
    @Autowired MangoWomanCoatsScrapper mangoWomanCoatsScrapper;
    @Autowired MangoWomanDressesAndJumpsuitsScrapper mangoWomanDressesAndJumpsuitsScrapper;
    @Autowired MangoWomanHatsScrapper mangoWomanHatsScrapper;

    @Override
    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(mangoWomanBagsScrapper.run(driver));
        products.addAll(mangoWomanBeltsScrapper.run(driver));
        products.addAll(mangoWomanCardagiansAndSweatersScrapper.run(driver));
        products.addAll(mangoWomanCoatsScrapper.run(driver));
        products.addAll(mangoWomanDressesAndJumpsuitsScrapper.run(driver));
        products.addAll(mangoWomanHatsScrapper.run(driver));

        return products;
    }
}
