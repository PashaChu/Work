package com.example.mywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8081")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
