package com.cheacloa.webscrapper.ca;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.hm.HMKidsProductsRetriever;
import com.cheacloa.webscrapper.hm.HMMenProductsRetriever;
import com.cheacloa.webscrapper.hm.HMUnisexProductsRetriever;
import com.cheacloa.webscrapper.hm.HMWomenProductsRetriever;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class CAProductsRetriever {
    @Autowired
    private CAWomenProductsRetriever caWomenProductsRetriever;
    @Autowired
    private CAMenProductsRetriever caMenProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    /* temporary solution */
    @PostConstruct
    public void postConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] CA scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<Product> products = new LinkedList<>();

        //products.addAll(caWomenProductsRetriever.run(driver));
        products.addAll(caMenProductsRetriever.run(driver));

        driver.close();

        System.out.println("CA products number: " + products.size()); //LOG
        System.out.println("[INFO] CA scrapping finished"); //LOG
        return products;
    }
}
