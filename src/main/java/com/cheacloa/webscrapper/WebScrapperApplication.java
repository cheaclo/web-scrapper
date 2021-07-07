package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.HM.HMScrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class WebScrapperApplication {
	@Autowired
	private HMScrapper scraper;

	@Bean
	public HMScrapper getScraper() {
		return new HMScrapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebScrapperApplication.class, args);
	}

}
