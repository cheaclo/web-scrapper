package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.ca.CAProductsRetriever;
import com.cheacloa.webscrapper.hm.HMProductsRetriever;
import com.cheacloa.webscrapper.reserved.ReservedProductsRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductsRetriever {
    private Logger log = LoggerFactory.getLogger(ProductsRetriever.class);

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
        log.info("Scrapping started");

        if (runCA)
            new Thread(() -> caProductsRetriever.retrieve()).start();
        if (runHM)
            new Thread(() -> hmProductsRetriever.retrieve()).start();
        if (runReserved)
            new Thread(() -> reservedProductsRetriever.retrieve()).start();

        log.info("Scrapping finished");
    }
}
