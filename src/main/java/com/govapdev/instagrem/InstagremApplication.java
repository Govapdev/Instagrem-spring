package com.govapdev.instagrem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class InstagremApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstagremApplication.class, args);
	}

}
