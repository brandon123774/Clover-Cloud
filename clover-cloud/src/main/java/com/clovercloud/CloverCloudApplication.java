package com.clovercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CloverCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloverCloudApplication.class, args);
	}

}
