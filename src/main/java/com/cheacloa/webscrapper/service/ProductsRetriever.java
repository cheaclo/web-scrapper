package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.ca.CAProductsRetriever;
import com.cheacloa.webscrapper.hm.HMProductsRetriever;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.reserved.ReservedProductsRetriever;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

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

        Product p1 = new Product("Random",
                23.1,
                41.2,
                "productURL",
                "imageURL",
                List.of(ProductCategory.LINGERIE, ProductCategory.OTHERS),
                ProductType.UNISEX,
                Shop.HM);
        Product p2 = new Product("Fancy",
                21.1,
                56.1,
                "productURL",
                "imageURL",
                List.of(ProductCategory.JEANS, ProductCategory.OTHERS, ProductCategory.DRESSES_AND_JUMPSUITS),
                ProductType.MAN,
                Shop.HM);

        productsSender.sendProducts(List.of(p1, p2), Shop.HM);

        LOG.info("Scrapping finished");
    }
}
