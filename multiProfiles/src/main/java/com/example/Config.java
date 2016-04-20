package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by floodliu on 16/4/19.
 */
@ConfigurationProperties(prefix = "config")
public class Config {

    private String a;
    private String b;
    private String c;

    private Env env;

    private Boolean dev;
    private Boolean prod;

    public Config() {}

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }

    public Boolean getDev() {
        return dev;
    }

    public void setDev(Boolean dev) {
        this.dev = dev;
    }

    public Boolean getProd() {
        return prod;
    }

    public void setProd(Boolean prod) {
        this.prod = prod;
    }
}
