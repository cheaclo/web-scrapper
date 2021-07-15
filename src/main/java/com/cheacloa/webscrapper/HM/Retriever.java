package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;

import java.util.List;

public interface Retriever {
    List<Product> run(WebDriver driver);
}
