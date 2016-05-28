package com.example;

import org.apache.tomcat.jdbc.pool.DataSource;
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
    private DataSource dataSource;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Datasource: " + dataSource.toString());
    }
}
