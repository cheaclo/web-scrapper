package com.cheacloa.webscrapper;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {
    private String title;
    private double price;
    private double regularPrice;
    private String shopHref;
    private String imageHref;

    public enum Category {
        ACCESSORIES,
        BABIES,
        TRENDS,
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
        SHIRTS_AND_SHORTS,
        SPORTS,
        SOCKS,
        SUITS,
        SWEATSHIRTS_HOODIES_AND_SWEATERS,
        SWIMWEAR,
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

    public Product(String title, double price, double regularPrice, String shopHref, String imageHref, List<Category> categories, Type type) {
        this.title = title;
        this.price = price;
        this.regularPrice = regularPrice;
        this.shopHref = shopHref;
        this.imageHref = imageHref;
        this.categories = categories;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", regularPrice=" + regularPrice +
                ", shopHref='" + shopHref + '\'' +
                ", imageHref='" + imageHref + '\'' +
                ", categories=" + categories +
                ", type=" + type +
                '}';
    }
}
