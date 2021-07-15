package com.cheacloa.webscrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CustomWebDriver {
    private boolean localRun;
    private String driverPath;
    private String userAgent;
    private String googleChromeBin;
    private String chromeDriverPath;
    private String herokuOptionsPath;

    public CustomWebDriver(@Value("${local.run}") boolean localRun,
                           @Value("${local.driver.path}") String driverPath,
                           @Value("${user.agent}") String userAgent,
                           @Value("${google.chrome.bin}") String googleChromeBin,
                           @Value("${heroku.driver.path}") String chromeDriverPath,
                           @Value("${heroku.options.bin}") String herokuOptionsPath) {
        this.localRun = localRun;
        this.driverPath = driverPath;
        this.userAgent = userAgent;
        this.googleChromeBin = googleChromeBin;
        this.chromeDriverPath = chromeDriverPath;
        this.herokuOptionsPath = herokuOptionsPath;
    }

    private HashMap<String, Object> preferencesInit() {
        HashMap<String, Object> prefs = new HashMap<>();
        // Prevent driver from loading the images - time saving
        prefs.put("profile.managed_default_content_settings.images", 2);
        return prefs;
    }

    private WebDriver localDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", userAgent);
        options.setExperimentalOption("prefs", preferencesInit());
        return new ChromeDriver(options);
    }

    private WebDriver herokuDriver() {
        System.setProperty("GOOGLE_CHROME_BIN", googleChromeBin);
        System.setProperty("CHROMEDRIVER_PATH", chromeDriverPath);

        ChromeOptions options = new ChromeOptions();
        options.setBinary(herokuOptionsPath);
        options.addArguments("--headless", userAgent);
        options.setExperimentalOption("prefs", preferencesInit());
        return new ChromeDriver(options);
    }

    public WebDriver getDriver() {
        return localRun ? localDriver() : herokuDriver();
    }
}