package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public abstract class ReservedScrapper {
    private final String PRODUCT_SELECTOR = "#categoryProducts > article > figure";
    private final String TITLE_SELECTOR = "div > figcaption > a";
    private final String PRICE_SELECTOR = "div > section > p.es-discount-price > span";
    private final String REGULAR_PRICE_SELECTOR = "div > section > p.es-regular-price > span";
    private final String IMAGE_SRC_SELECTOR = "a > img";

    protected String url;

    protected Product.Shop shop;
    protected Product.Type type;
    protected List<Product.Category> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        driver.get(url);

        List<WebElement> elements = driver.findElements(By.cssSelector(PRODUCT_SELECTOR));

        for (WebElement element : elements) {
            String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getText();
            String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getText();
            String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getText();
            String shopHref = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("href");
            String imageSrc = driver.findElement(By.cssSelector(IMAGE_SRC_SELECTOR)).getAttribute("src");
            products.add(new Product(title,
                    extractDouble(price),
                    extractDouble(regularPrice),
                    shopHref,
                    imageSrc,
                    categories,
                    type,
                    shop));

            System.out.println(products.get(products.size() - 1));
        }

        System.out.println(products.size() + " " + (products.isEmpty() ? "Empty" : products.get(0))); //LOG
        return products;
    }

    private double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
