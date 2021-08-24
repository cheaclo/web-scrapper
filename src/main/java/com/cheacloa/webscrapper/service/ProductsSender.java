package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsSender {
    private final String temp = "{\n" +
            "    \"senderName\" : \"com.cheacloa.webscrapper\",\n" +
            "    \"authenticationCode\" : \"d720c62591d4929e1810f90bbd7f7ba7\",\n" +
            "    \"shopName\" : \"Reserved\",\n" +
            "    \"products\" : [ \n" +
            "        {\n" +
            "            \"title\" : \"Jeans\",\n" +
            "            \"price\" : 12.65,\n" +
            "            \"regularPrice\" : 22.1,\n" +
            "            \"productUrl\" : \"shopURL\",\n" +
            "            \"imageUrl\" : \"imageURL\",\n" +
            "            \"categories\" : [ \"ACCESSORIES\", \"JEANS\" ],\n" +
            "            \"type\" : \"MAN\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"title\" : \"Kettel\",\n" +
            "            \"price\" : \"0.21\",\n" +
            "            \"regularPrice\" : 4.32,\n" +
            "            \"productUrl\" : \"shopURL\",\n" +
            "            \"imageUrl\" : \"imageURL\",\n" +
            "            \"categories\" : [ \"OTHERS\", \"JEANS\", \"LINGERIE\" ],\n" +
            "            \"type\" : \"MAN\"\n" +
            "        } \n" +
            "    ]\n" +
            "}";

    @Autowired
    private ModelConverter modelConverter;

    @Value("${sender.name}")
    private String senderName;
    @Value("${sender.authentication.code}")
    private String authenticationCode;
    @Value("${database.clothes.url.save}")
    private String clothesDatabaseSaveUrl;

    public void sendProducts(List<Product> products) {
        System.out.println(senderName);
        System.out.println(authenticationCode);
        

//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<String> request =
//                new HttpEntity<String>(temp, headers);
//        String personResultAsJsonStr =
//                restTemplate.postForObject(clothesDatabaseSaveUrl, request, String.class);
//
//        System.out.println("Result " + personResultAsJsonStr);
    }
}
