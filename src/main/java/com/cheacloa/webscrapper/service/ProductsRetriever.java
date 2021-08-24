package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.ca.CAProductsRetriever;
import com.cheacloa.webscrapper.hm.HMProductsRetriever;
import com.cheacloa.webscrapper.reserved.ReservedProductsRetriever;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
public class ProductsRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(ProductsRetriever.class);

    @Autowired
    private CAProductsRetriever caProductsRetriever;
    @Autowired
    private HMProductsRetriever hmProductsRetriever;
    @Autowired
    private ReservedProductsRetriever reservedProductsRetriever;

    @Autowired
    private ProductsSender productsSender;

    @Value("${run.ca}")
    private boolean runCA;
    @Value("${run.hm}")
    private boolean runHM;
    @Value("${run.reserved}")
    private boolean runReserved;

    @PostConstruct
    public void postConstruct() throws JsonProcessingException {
        LOG.info("Scrapping started");
        LOG.info("Started at " + LocalDateTime.now());

//        if (runCA)
//            new Thread(() -> caProductsRetriever.retrieve()).start();
//        if (runHM)
//            new Thread(() -> hmProductsRetriever.retrieve()).start();
//        if (runReserved)
//            new Thread(() -> reservedProductsRetriever.retrieve()).start();
        productsSender.sendProducts(null);

        LOG.info("Scrapping finished");
    }
}
