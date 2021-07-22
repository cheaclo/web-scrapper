package com.cheacloa.webscrapper.mango;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class MangoScrapper {
    private final int SCROLL_Y_SHIFT = 100;
    private final String PRODUCT_CLASSNAME= "#page1 > div > ul > li";
    private final String TITLE_SELECTOR = "div > div._2y5JN > span";
    private final String PRICE_SELECTOR = "div > div.prices-container._3n3P8 > span.price-sale.sg-body-small._2P5os";
    private final String REGULAR_PRICE_SELECTOR = "div > div.prices-container._3n3P8 > span.price-crossed-1.sg-body-small._3ILTC";
    private final String IMAGE_SRC_SELECTOR = "a._6vE5I > div._7MxGJ > img";
    private final String ACCEPT_COOKIES_SELECTOR = "#onetrust-accept-btn-handler";
    private final String CLOSE_POPUP_SELECTOR = "#FormSeleccionPaisIP > div > div > div > div > div > div.icon.closeModal.icon__close.desktop.confirmacionPais";

    protected String url;

    protected Product.Shop shop;
    protected Product.Type type;
    protected List<Product.Category> categories;

    public List<Product> run(WebDriver driver) {
        List<Product> products = new LinkedList<>();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(url);
        scrollPageDown(driver, SCROLL_Y_SHIFT);

        List<WebElement> elements = driver.findElements(By.cssSelector(PRODUCT_CLASSNAME));

        try {
            for (WebElement element : elements) {
                System.out.println(element.getAttribute("innerHTML"));
                String title = element.findElement(By.cssSelector(TITLE_SELECTOR)).getAttribute("innerHTML");
                String price = element.findElement(By.cssSelector(PRICE_SELECTOR)).getAttribute("innerHTML");
                String regularPrice = element.findElement(By.cssSelector(REGULAR_PRICE_SELECTOR)).getAttribute("innerHTML");
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
            }
        } catch (NoSuchElementException e) {
            System.out.println("[WARN] Repeat scrapping"); //LOG
            return run(driver);
        }


        System.out.println(products.size() + " " + (products.isEmpty() ? "Empty" : products.get(0))); //LOG
        return products;
    }

    private double extractDouble(String arg) {
        return Double.parseDouble(arg.replaceAll("[^0-9.]+", " ").trim());
    }

    private void acceptCookies(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector(ACCEPT_COOKIES_SELECTOR)).click();
            driver.findElement(By.cssSelector(CLOSE_POPUP_SELECTOR)).click();
        } catch(NoSuchElementException ignored) {}
    }
    private void scrollPageDown(WebDriver driver, int yShift) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        acceptCookies(driver);

        long scrollHeight = (Long) jsExecutor.executeScript("return document.body.scrollHeight;");
        for (long yOffset = yShift; yOffset < scrollHeight; yOffset += yShift) {
            jsExecutor.executeScript("window.scrollTo(0, " + yOffset + ")");
        }
    }
}
