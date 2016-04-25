package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(UicController.class);

    @Autowired
    private UicClient uicClient;

    @RequestMapping(value = "/{userName}/phone", method = RequestMethod.GET)
    public String getPhoneNumber(@PathVariable("userName") String userName) {
        logger.info("Request phone number of " + userName);

        Long version = uicClient.getVersion();
        logger.info("UIC version: " + version);
        logger.info("Date of version: " + uicClient.getDateOfVersion(version));


        String phoneNumber = uicClient.getPhoneNumber(userName);
        logger.info("Phone number is: " + phoneNumber);

        return phoneNumber;
    }
}
