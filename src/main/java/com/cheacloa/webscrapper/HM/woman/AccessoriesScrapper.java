package com.cheacloa.webscrapper.HM.woman;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AccessoriesScrapper {
    private final String HM_URL_PARAMS = "?sort=stock&image-size=small&image=stillLife&offset=0&page-size=";
    private final String TITLE_SELECTOR = ".item-details > h3 > a";
    private final String PRICE_SELECTOR = ".item-details > strong > span.price.sale";
    private final String REGULAR_PRICE_SELECTOR = ".item-details > strong > span.price.regular";
    private final String IMAGE_SRC_SELECTOR = ".image-container > a > img";

    private String numberOfproductsSelector = "#page-content > div > div:nth-child(4) > div.products-filter-container > div.products-filter.sticky-on-scroll > form > div";
    protected String hmURL = "https://www2.hm.com/en_gb/sale/ladies/accessories.html";

    private WebDriver driver;

    private int getNumberOfProducts() {
        int numberOfProducts;

        driver.navigate().to(hmURL);
        WebElement numberOfProductsElement = driver.findElement(By.cssSelector(numberOfproductsSelector));
        numberOfProducts = extractInt(numberOfProductsElement.getText());

        return numberOfProducts;
    }

    public List<Product> run(WebDriver driver) {
        this.driver = driver;
        int numberOfProducts = getNumberOfProducts();
        List<Product> products = new ArrayList<>();

        String allHMSalesURL = hmURL + HM_URL_PARAMS + numberOfProducts;
        driver.navigate().to(allHMSalesURL);
        List<WebElement> elements = driver.findElements(By.className("hm-product-item"));

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

    private int extractInt(String arg) {
        return Integer.parseInt(arg.replaceAll("[^0-9.]+", " ").trim());
    }

    private double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
