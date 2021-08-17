package com.cheacloa.webscrapper.hm;

import com.cheacloa.webscrapper.model.ProductCategory;
import com.cheacloa.webscrapper.model.Product;
import com.cheacloa.webscrapper.model.Shop;
import com.cheacloa.webscrapper.model.ProductType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public abstract class HMScrapper {
    private static final Logger LOG = LoggerFactory.getLogger(HMScrapper.class);

    private final int MAX_NUMBER_OF_PRODUCTS = 10000;
    private final String HM_URL_PARAMS = "?sort=stock&image-size=small&image=stillLife&offset=0&page-size=";
    private final String PRODUCT_CLASSNAME = "hm-product-item";
    private final String TITLE_SELECTOR = ".item-details > h3 > a";
    private final String PRICE_SELECTOR = ".item-details > strong > span.price.sale";
    private final String REGULAR_PRICE_SELECTOR = ".item-details > strong > span.price.regular";
    private final String IMAGE_SRC_SELECTOR = ".image-container > a > img";

    protected String url;

    protected Shop shop;
    protected ProductType type;
    protected List<ProductCategory> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        String allHMSalesURL = url + HM_URL_PARAMS + MAX_NUMBER_OF_PRODUCTS;
        driver.get(allHMSalesURL);

        List<WebElement> elements = driver.findElements(By.className(PRODUCT_CLASSNAME));

        for (WebElement element : elements) {
            try {
                String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getText();
                String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getText();
                String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getText();
                String shopHref = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("href");
                String imageSrc = element.findElement(By.cssSelector(IMAGE_SRC_SELECTOR)).getAttribute("data-altimage");
                products.add(new Product(title,
                        extractDouble(price),
                        extractDouble(regularPrice),
                        shopHref,
                        imageSrc,
                        categories,
                        type,
                        shop));
            } catch (NoSuchElementException e) {
                LOG.warn("HM element not found");
            }
        }

        LOG.debug(products.size() + " " + (products.isEmpty() ? "Empty" : products.get(0)));
        return products;
    }

    private static double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
