package com.cheacloa.webscrapper.service;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.RequestProduct;
import com.cheacloa.webscrapper.model.Shop;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
class ModelConverter {
    static List<RequestProduct> convertModelProductsToRequestProducts(List<Product> products, Shop shop) {
        List<RequestProduct> requestProducts = new LinkedList<>();

        for (Product product : products) {
            RequestProduct requestProduct = new RequestProduct(product.getTitle(),
                    extractString(product.getPrice()),
                    extractString(product.getRegularPrice()),
                    product.getProductUrl(),
                    product.getImageUrl(),
                    extraxtCategories(product.getCategories()),
                    product.getType().toString());
            requestProducts.add(requestProduct);
        }

        return requestProducts;
    }

    private static String extractString(double arg) {
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
