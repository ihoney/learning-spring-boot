package com.example.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by hongtao on 16/4/18.
 */
public class StartupRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Datasource: " + dataSource.toString());
    }
}
