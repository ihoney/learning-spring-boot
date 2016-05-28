package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DatasourceApplication.class, args);
	}

	@Bean
	public StartupRunner startupRunner() {
		return new StartupRunner();
	}
}
