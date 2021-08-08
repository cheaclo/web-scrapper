package com.cheacloa.webscrapper;

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
    private List<Category> categories;
    private Type type;
    private Shop shop;
}
