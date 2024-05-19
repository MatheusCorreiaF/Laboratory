package br.com.redfield.mongoDBexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MongoDBexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDBexampleApplication.class, args);
	}

}
