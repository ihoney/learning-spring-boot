package com.example;

import com.example.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by floodliu on 16/5/28.
 */
public class StartupRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Number of books: " + bookRepository.count());
    }
}
