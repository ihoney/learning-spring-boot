package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by hongtao on 16/4/20.
 */
@ConfigurationProperties(prefix = "config.env")
public class Env {

    private String name;
    private String address;

    public Env() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
