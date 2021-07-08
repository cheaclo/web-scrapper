package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsRetriever {
    @Value("${driver.path}")
    private String DRIVER_PATH;

    @Autowired
    private LadiesProductsRetriever ladiesProductsRetriever;

    /* Only for test purposes, will be removed */
    @PostConstruct
    public void temporaryPostConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        List<Product> products = new ArrayList<>();
        String userAgent = "user-agent={0}Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.50 Safari/537.36";

        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", userAgent);
        WebDriver driver = new ChromeDriver(options);

        List<Product> ladies = ladiesProductsRetriever.run(driver);

        products.addAll(ladies);

        driver.close();
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
