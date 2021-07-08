package com.cheacloa.webscrapper.HM;

import com.cheacloa.webscrapper.HM.woman.AccessoriesScrapper;
import com.cheacloa.webscrapper.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HMScrapper {
    @Value("${driver.path}")
    private String DRIVER_PATH;

    /* Only for test purposes, will be removed */
    @PostConstruct
    public void temporaryPostConstruct() {
        run();
    }

    public List<Product> run() {
        System.out.println("[INFO] Hm scrapping started"); //LOG

        List<Product> products = new ArrayList<>();
        System.setProperty("webdriver.opera.driver", DRIVER_PATH);
        WebDriver driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        new AccessoriesScrapper().run(driver);

        driver.close();
        System.out.println("[INFO] Hm scrapping finished"); //LOG
        return products;
    }
}
