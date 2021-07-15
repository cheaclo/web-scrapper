package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.HM.HMProductsRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebScrapperApplication {
	@Autowired
	private HMProductsRetriever productsRetriever;

	public static void main(String[] args) {
		SpringApplication.run(WebScrapperApplication.class, args);
	}
}
