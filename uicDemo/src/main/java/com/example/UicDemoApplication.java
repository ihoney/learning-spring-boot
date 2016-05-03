package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:applicationContext-ws.xml")
public class UicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UicDemoApplication.class, args);
	}
}
