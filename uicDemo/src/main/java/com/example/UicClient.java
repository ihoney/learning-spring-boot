package com.example;

import com.baidu.uic.ws.dto.UserDTO;
import com.baidu.uic.ws.interfaces.IUserRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hongtao on 16/4/25.
 */
@Configuration
public class UicClient {

    @Autowired
    private IUserRemoteService userRemoteService;

    public Long getVersion() {
        return userRemoteService.getLatestVersion();
    }

    public String getPhoneNumber(String userName) {
        UserDTO user = userRemoteService.getUserByUsername(userName);
        return user.getPhoneNumber();
    }
}
