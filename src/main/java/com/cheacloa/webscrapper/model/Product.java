package com.cheacloa.webscrapper.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private String title;
    private double price;
    private double regularPrice;
    private String shopHref;
    private String imageSrc;
    private List<ProductCategory> categories;
    private ProductType type;
    private Shop shop;
}
