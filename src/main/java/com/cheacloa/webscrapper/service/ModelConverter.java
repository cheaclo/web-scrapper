package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.RequestProduct;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
class ModelConverter {
    static List<RequestProduct> convertModelProductsToRequestProducts(List<Product> products) {
        List<RequestProduct> requestProducts = new LinkedList<>();

        for (Product product : products) {
            RequestProduct requestProduct = new RequestProduct(product.getTitle(),
                    extractString(product.getPrice()),
                    extractString(product.getRegularPrice()),
                    product.getProductUrl(),
                    product.getImageUrl(),
                    extractCategories(product.getCategories()),
                    product.getType().toString());
            requestProducts.add(requestProduct);
        }

        return requestProducts;
    }

    private static String extractString(double arg) {
        return Double.toString(arg);
    }

    private static List<String> extractCategories(List<ProductCategory> categories) {
        List<String> stringCategories = new LinkedList<>();
        for (ProductCategory category : categories) {
            stringCategories.add(category.toString());
        }
        return stringCategories;
    }
}
