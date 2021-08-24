package com.cheacloa.webscrapper.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RequestProduct {
    private String title;
    private String price;
    private String regularPrice;
    private String productUrl;
    private String imageUrl;
    private List<String> categories;
    private String type;
}
