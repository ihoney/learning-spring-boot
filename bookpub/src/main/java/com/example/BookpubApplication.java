package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookpubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookpubApplication.class, args);
	}

	@Bean
	public StartupRunner startupRunner() {
		return new StartupRunner();
	}
}
