package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.Product;
import com.cheacloa.webscrapper.hm.Retriever;
import com.cheacloa.webscrapper.hm.woman.*;
import com.cheacloa.webscrapper.reserved.woman.ReservedWomanBestsellersScrapper;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ReservedWomenProductsRetriever implements Retriever {
    @Autowired ReservedWomanBestsellersScrapper reservedWomanBestsellersScrapper;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        products.addAll(reservedWomanBestsellersScrapper.run(driver));

        return products;
    }
}
