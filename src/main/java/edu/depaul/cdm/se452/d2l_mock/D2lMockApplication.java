package edu.depaul.cdm.se452.d2l_mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class D2lMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2lMockApplication.class, args);
	}
}
