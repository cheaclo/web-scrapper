package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.CustomWebDriver;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductsRetriever {
    @Autowired
    private LadiesProductsRetriever ladiesProductsRetriever;

    @Autowired
    private CustomWebDriver customWebDriver;

    @GetMapping("/hm")
    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        WebDriver driver = customWebDriver.getDriver();
        List<Product> products = new LinkedList<>();

        List<Product> ladies = ladiesProductsRetriever.run(driver);

        products.addAll(ladies);

        driver.close();
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
