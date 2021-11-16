package com.cheacloa.webscrapper.reserved;

import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.ProductType;
import com.cheacloa.webscrapper.model.Shop;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public abstract class ReservedScrapper {
    private static final Logger LOG = LoggerFactory.getLogger(ReservedScrapper.class);

    private final String PRODUCT_SELECTOR = "#categoryProducts > article:nth-child(2) > figure";
    private final String TITLE_SELECTOR = "div > h3 > a";
    private final String PRICE_SELECTOR = "div > section > p.es-discount-price > span";
    private final String REGULAR_PRICE_SELECTOR = "div > section > p.es-regular-price > span";
    private final String IMAGE_SRC_SELECTOR = "a > img";

    protected String url;

    protected Shop shop;
    protected ProductType type;
    protected List<ProductCategory> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        driver.get(url);

        List<WebElement> elements = driver.findElements(By.cssSelector(PRODUCT_SELECTOR));

        for (WebElement element : elements) {
            try {
                String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getText();
                String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getText();
                String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getText();
                String shopHref = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("href");
                String imageSrc = element.findElement(By.cssSelector(IMAGE_SRC_SELECTOR)).getAttribute("src");
                products.add(new Product(title,
                        extractDouble(price),
                        extractDouble(regularPrice),
                        shopHref,
                        imageSrc,
                        categories,
                        type,
                        shop));
            } catch (NoSuchElementException e) {
                LOG.warn("Reserved element not found");
            }
        }

        LOG.debug(products.size() + " " + (products.isEmpty() ? "Empty" : products.get(0)));
        return products;
    }

    private static double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
