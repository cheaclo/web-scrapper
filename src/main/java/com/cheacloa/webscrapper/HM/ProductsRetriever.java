package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductsRetriever {
    @Value("${local.run}")
    private boolean LOCAL_RUN;

    @Value("${local.driver.path}")
    private String DRIVER_PATH;

    @Value("${user.agent}")
    private String USER_AGENT;

    @Value("${google.chrome.bin}")
    private String GOOGLE_CHROME_BIN;

    @Value("${heroku.driver.path}")
    private String CHROMEDRIVER_PATH;

    @Value("${heroku.options.bin}")
    private String HEROKU_OPTIONS_BIN;

    @Autowired
    private LadiesProductsRetriever ladiesProductsRetriever;

    private HashMap<String, Object> preferencesInit() {
        HashMap<String, Object> prefs = new HashMap<>();
        // Prevent driver from loading the images - time saving
        prefs.put("profile.managed_default_content_settings.images", 2);
        return prefs;
    }

    private WebDriver localInit() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", USER_AGENT);
        options.setExperimentalOption("prefs", preferencesInit());
        return new ChromeDriver(options);
    }

    private WebDriver herokuInit() {
        System.setProperty("GOOGLE_CHROME_BIN", GOOGLE_CHROME_BIN);
        System.setProperty("CHROMEDRIVER_PATH", CHROMEDRIVER_PATH);

        ChromeOptions options = new ChromeOptions();
        options.setBinary(HEROKU_OPTIONS_BIN);
        options.addArguments("--headless", USER_AGENT);
        options.setExperimentalOption("prefs", preferencesInit());
        return new ChromeDriver(options);
    }

    @GetMapping("/hm")
    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        WebDriver driver = LOCAL_RUN ? localInit() : herokuInit();
        List<Product> products = new LinkedList<>();

        List<Product> ladies = ladiesProductsRetriever.run(driver);

        products.addAll(ladies);

        driver.close();
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
