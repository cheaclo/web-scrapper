package com.cheacloa.webscrapper.mango;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class MangoProductsRetriever {
    @Autowired
    private CustomWebDriver customWebDriver;

    /* temporary solution */
    @PostConstruct
    public void postConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] Mango scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        List<Product> products = new LinkedList<>();

        driver.close();

        System.out.println("Mango products number: " + products.size()); //LOG
        System.out.println("[INFO] Mango scrapping finished"); //LOG
        return products;
    }
}
