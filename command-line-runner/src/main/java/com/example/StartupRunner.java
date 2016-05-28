package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by floodliu on 16/5/28.
 */
public class StartupRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Hello");
    }
}
