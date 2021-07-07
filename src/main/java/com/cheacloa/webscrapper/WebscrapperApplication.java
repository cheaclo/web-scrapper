package com.cheacloa.webscrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class WebscrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebscrapperApplication.class, args);

		System.setProperty("webdriver.opera.driver", "src\\main\\resources\\drivers\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Launch website
		driver.navigate().to("https://www2.hm.com/en_gb/sale/ladies/view-all.html?sort=stock&image-size=small&image=stillLife&offset=0&page-size=4087");
		//Maximize the browser
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.className("product-item"));
		System.out.println(elements.size());
	}

}
