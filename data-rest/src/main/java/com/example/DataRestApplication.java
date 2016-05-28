package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DataRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) throws Exception {
		jdbcTemplate.execute("insert into players values(default, 'Lionel', 'Messi', 10, 'FC Barcelona')");
		jdbcTemplate.execute("insert into players values(default, 'Andres', 'Iniesta', 8, 'FC Barcelona')");
	}
}
