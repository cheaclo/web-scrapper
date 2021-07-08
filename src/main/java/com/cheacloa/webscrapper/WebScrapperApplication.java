package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.HM.ProductsRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebScrapperApplication {
	@Autowired
	private ProductsRetriever scraper;

	@Bean
	public ProductsRetriever getScraper() {
		return new ProductsRetriever();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebScrapperApplication.class, args);
	}

}
