package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.RequestProduct;
import com.cheacloa.webscrapper.model.Shop;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
class ModelConverter {
    private final ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

    public List<RequestProduct> convertModelProductsToRequestProducts(List<Product> products, Shop shop) throws JsonProcessingException {
        List<RequestProduct> requestProducts = new LinkedList<>();

        for (Product product : products) {
            RequestProduct requestProduct = new RequestProduct(product.getTitle(),
                    extractString(product.getPrice()),
                    extractString(product.getRegularPrice()),
                    product.getProductUrl(),
                    product.getImageUrl(),
                    extraxtCategories(product.getCategories()),
                    product.getType().toString());
        }
        return requestProducts;
//        return objectWriter.writeValueAsString(products);
    }

    private String extractString(double arg) {
        return Double.toString(arg);
    }

    private static List<String> extraxtCategories(List<ProductCategory> categories) {
        List<String> stringCategories = new LinkedList<>();
        for (ProductCategory category : categories) {
            stringCategories.add(category.toString());
        }
        return stringCategories;
    }
}
