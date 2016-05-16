package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    /*
     * 以CLI的形式,通过RestTemplate调用第三方的REST服务。
     */
    @Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		String serviceUrl = "http://gturnquist-quoters.cfapps.io/api/random";
		Quote quote = restTemplate.getForObject(serviceUrl, Quote.class);
		logger.info(quote.toString());
	}
}
