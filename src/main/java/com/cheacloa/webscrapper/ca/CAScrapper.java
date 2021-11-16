package com.cheacloa.webscrapper.ca;

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

public abstract class CAScrapper {
    private static final Logger LOG = LoggerFactory.getLogger(CAScrapper.class);

    private final String CA_PAGE_NUMBER_PARAM = "?pagenumber=";
    private final String PAGE_NAVIGATORS_SELECTOR = "ul.pagination > li";
    private final String PRODUCT_SELECTOR = "div.product-tile.product-tile--quickwish";
    private final String TITLE_SELECTOR = "a > p";
    private final String REGULAR_PRICE_SELECTOR = "a > div.product-tile__price > span.product-tile__price--old";
    private final String PRICE_SELECTOR = "a > div.product-tile__price > span.product-tile__price--new";
    private final String PRODUCT_HREF_SELECTOR = "a";
    private final String IMAGE_SRC_SELECTOR = "a > div.product-tile__img-wrapper > picture > img";

    protected String url;

    protected Shop shop;
    protected ProductType type;
    protected List<ProductCategory> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        driver.get(url);
        List<WebElement> pageNavigators = driver.findElements(By.cssSelector(PAGE_NAVIGATORS_SELECTOR));
        int numberOfPages = pageNavigators.size();

        int page = 1;
        while (true) {
            products.addAll(scrapPage(driver));
            if (++page < numberOfPages)
                driver.get(url + CA_PAGE_NUMBER_PARAM + page);
            else
                break;
        }

        LOG.debug(products.size() + " " + (products.isEmpty() ? "Empty" : products.get(0)));
        return products;
    }

    private List<Product> scrapPage(WebDriver driver) {
        List<Product> products = new LinkedList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(PRODUCT_SELECTOR));


        for (WebElement element : elements) {
            try {
                String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("innerHTML");
                String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getAttribute("innerHTML");
                String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getAttribute("innerHTML");
                String shopHref = element.findElement(By.cssSelector(PRODUCT_HREF_SELECTOR)).getAttribute("href");
                WebElement imageElement = element.findElement(By.cssSelector(IMAGE_SRC_SELECTOR));
                String imageSrc = imageElement.getAttribute("data-src");
                if (imageSrc == null)
                    imageSrc = imageElement.getAttribute("src");

                products.add(new Product(title,
                        extractDouble(price),
                        extractDouble(regularPrice),
                        shopHref,
                        imageSrc,
                        categories,
                        type,
                        shop));
            } catch (NoSuchElementException e) {
                LOG.warn("CA element not found");
            }
        }

        return products;
    }

    private static double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }
}
