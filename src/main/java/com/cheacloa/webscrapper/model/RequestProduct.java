package com.cheacloa.webscrapper.model;

import lombok.Data;

import java.util.List;

@Data
class RequestProduct {
    private String title;
    private String price;
    private String regularPrice;
    private String productUrl;
    private String imageUrl;
    private List<String> categories;
    private String type;
}
