package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
	}

	@Bean
	public StartupRunner startupRunner() {
		return new StartupRunner();
	}
}
