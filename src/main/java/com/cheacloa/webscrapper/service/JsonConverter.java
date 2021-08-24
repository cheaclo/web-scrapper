package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.List;

class JsonConverter {
    private final ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

    String convertListToJson(List<Product> products) throws JsonProcessingException {
        return objectWriter.writeValueAsString(products);
    }
}
