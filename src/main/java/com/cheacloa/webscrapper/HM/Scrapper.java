package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Scrapper {
    private final String HM_URL_PARAMS = "?sort=stock&image-size=small&image=stillLife&offset=0&page-size=";
    private final String PRODUCT_CLASSNAME= "hm-product-item";
    private final String TITLE_SELECTOR = ".item-details > h3 > a";
    private final String PRICE_SELECTOR = ".item-details > strong > span.price.sale";
    private final String REGULAR_PRICE_SELECTOR = ".item-details > strong > span.price.regular";
    private final String IMAGE_SRC_SELECTOR = ".image-container > a > img";
    private final int MAX_NUMBER_OF_PRODUCTS = 10000;

    protected String numberOfProductsSelector;
    protected String url;

    protected Product.Type type;
    protected List<Product.Category> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new ArrayList<>();

        String allHMSalesURL = url + HM_URL_PARAMS + MAX_NUMBER_OF_PRODUCTS;
        driver.get(allHMSalesURL);

        List<WebElement> elements = driver.findElements(By.className(PRODUCT_CLASSNAME));

        for (WebElement element : elements) {
            String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getText();
            String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getText();
            String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getText();
            String shopHref = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("href");
            String imageSrc = element.findElement(By.cssSelector(IMAGE_SRC_SELECTOR)).getAttribute("src");
            if (imageSrc.equals(""))
                imageSrc = element.findElement(By.cssSelector(IMAGE_SRC_SELECTOR)).getAttribute("data-altimage");
            products.add(new Product(title,
                    extractDouble(price),
                    extractDouble(regularPrice),
                    shopHref,
                    imageSrc,
                    Arrays.asList(Product.Category.ACCESSORIES),
                    Product.Type.WOMAN));
        }

        return products;
    }

    private double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
