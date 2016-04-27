package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static java.lang.Thread.*;

/**
 * Created by hongtao on 16/4/27.
 */
@Service
public class HelloService {

    private static Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Async
    public void count() {
        for (int i = 0; true; i++) {
            logger.info(currentThread().getId() + " : " + i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
