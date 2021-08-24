package com.cheacloa.webscrapper.model;

import lombok.Data;

import java.util.List;

@Data
public class RequestProductsSave {
    private String senderName;
    private String authenticationCode;
    private String shopName;
    List<RequestProduct> products;
}
