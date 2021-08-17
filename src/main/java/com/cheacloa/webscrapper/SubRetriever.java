package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.model.Product;
import org.openqa.selenium.WebDriver;

import java.util.List;

public interface SubRetriever {
    List<Product> run(WebDriver driver);
}
