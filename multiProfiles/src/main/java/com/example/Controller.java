package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by floodliu on 16/4/19.
 */
@RestController
public class Controller {

    @Autowired
    private Config config;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public Config getConfig() {
        return config;
    }
}
