package com.example.bookpub;

import com.example.bookpub.repository.BookRepository;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by hongtao on 16/4/18.
 */
public class StartupRunner implements CommandLineRunner {

    protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Datasource: " + dataSource.toString());
        logger.info("Number of books: " + bookRepository.count());
    }

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }
}
