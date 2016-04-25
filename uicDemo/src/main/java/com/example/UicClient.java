package com.example;

import com.baidu.uic.ws.dto.UserDTO;
import com.baidu.uic.ws.interfaces.IUserRemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by hongtao on 16/4/25.
 */
@Component
public class UicClient {

    private static Logger logger = LoggerFactory.getLogger(UicClient.class);

    @Autowired
    private IUserRemoteService userRemoteService;

    public Long getVersion() {
        return userRemoteService.getLatestVersion();
    }

    public Date getDateOfVersion(Long version) {
        return userRemoteService.getDateOfVersion(version);
    }

    public String getPhoneNumber(String userName) {
        UserDTO user = userRemoteService.getUserByUsername(userName);

        logger.info(user.getUsername());
        logger.info(user.getEmail());
        logger.info(user.getMobileNumber());
        return user.getMobileNumber();
    }
}
