package com.cheacloa.webscrapper.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RequestProductsSave {
    private String senderName;
    private String authenticationCode;
    private Shop shop;
    List<RequestProduct> products;
}
