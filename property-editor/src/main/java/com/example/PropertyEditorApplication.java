package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PropertyEditorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PropertyEditorApplication.class, args);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) throws Exception {
		jdbcTemplate.execute("insert into teams values('FC Barcelona')");
		jdbcTemplate.execute("insert into players values(default, 'Lionel Messi', 10, 'FC Barcelona')");
		jdbcTemplate.execute("insert into players values(default, 'Andres Iniesta', 8, 'FC Barcelona')");
	}
}
