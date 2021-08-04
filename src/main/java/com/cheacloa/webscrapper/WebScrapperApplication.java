package com.cheacloa.webscrapper;

import com.cheacloa.webscrapper.hm.HMProductsRetriever;
import com.cheacloa.webscrapper.reserved.ReservedProductsRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebScrapperApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebScrapperApplication.class, args);
	}
}
