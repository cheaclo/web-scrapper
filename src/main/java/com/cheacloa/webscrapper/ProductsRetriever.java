package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.ca.CAProductsRetriever;
import com.cheacloa.webscrapper.hm.HMProductsRetriever;
import com.cheacloa.webscrapper.reserved.ReservedProductsRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductsRetriever {
    @Autowired
    CAProductsRetriever caProductsRetriever;
    @Autowired
    HMProductsRetriever hmProductsRetriever;
    @Autowired
    ReservedProductsRetriever reservedProductsRetriever;

    @Value("${run.ca}")
    private boolean runCA;
    @Value("${run.hm}")
    private boolean runHM;
    @Value("${run.reserved}")
    private boolean runReserved;

    @PostConstruct
    public void postConstruct() {
        System.out.println("[INFO] Scrapping started"); //LOG

        if (runCA)
            new Thread(() -> caProductsRetriever.retrieve()).start();
        if (runHM)
            new Thread(() -> hmProductsRetriever.retrieve()).start();
        if (runReserved)
            new Thread(() -> reservedProductsRetriever.retrieve()).start();

        System.out.println("[INFO] Scrapping finished"); //LOG
    }
}
