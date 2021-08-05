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

    public enum Category {
        ACCESSORIES,
        BABIES,
        BLAZERS,
        CARDIGANS_AND_JUMPERS,
        DRESSES_AND_JUMPSUITS,
        EXTRA_DISCOUNTS,
        JACKETS_AND_COATS,
        JEANS,
        KNITWEAR,
        LINGERIE,
        OTHERS,
        POLO_SHIRTS,
        SHOES,
        SHIRTS_AND_BLOUSES,
        SKIRTS_AND_SHORTS,
        SPORTS,
        SOCKS,
        SUITS,
        SWEATSHIRTS_HOODIES_AND_SWEATERS,
        SWIMWEAR,
        TRENDS,
        TSHIRTS_AND_TOPS,
        TROUSERS_AND_LEGGINGS,
        UNDERWEAR_AND_NIGHTWEAR
    }

    private List<Category> categories;

    public enum Type {
        KID,
        MAN,
        WOMAN,
        UNISEX
    }

    private Type type;

    public enum Shop {
        HM,
        CA,
        RESERVED
    }

    private Shop shop;
}
