package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.RequestProduct;
import com.cheacloa.webscrapper.model.RequestProductsSave;
import com.cheacloa.webscrapper.model.Shop;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsSender {
    private final ObjectWriter OBJECT_WRITER = new ObjectMapper().writer().withDefaultPrettyPrinter();
    private static final Logger LOG = LoggerFactory.getLogger(ProductsRetriever.class);

    @Value("${sender.name}")
    private String senderName;
    @Value("${sender.authentication.code}")
    private String authenticationCode;
    @Value("${database.clothes.url.save}")
    private String clothesDatabaseSaveUrl;

    private final RestTemplate restTemplate;

    public void sendProducts(List<Product> products, Shop shop) {
        List<RequestProduct> requestProducts = ModelConverter.convertModelProductsToRequestProducts(products);
        RequestProductsSave requestProductsSave = new RequestProductsSave(senderName,
                authenticationCode,
                shop.toString(),
                requestProducts);

        try {
            String jsonRequestProductsSave = OBJECT_WRITER.writeValueAsString(requestProductsSave);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> request =
                    new HttpEntity<>(jsonRequestProductsSave, headers);
            String personResultAsJsonStr =
                    restTemplate.postForObject(clothesDatabaseSaveUrl, request, String.class);

            LOG.info("Sending " + shop + "'s products response " + personResultAsJsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
