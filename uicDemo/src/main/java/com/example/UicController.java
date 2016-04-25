package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongtao on 16/4/25.
 */
@RestController
public class UicController {

    @Autowired
    private UicClient uicClient;

    @RequestMapping(value = "/{userName}/phone", method = RequestMethod.GET)
    public String getPhoneNumber(@PathVariable("userName") String userName) {
        return uicClient.getPhoneNumber(userName);
    }
}
