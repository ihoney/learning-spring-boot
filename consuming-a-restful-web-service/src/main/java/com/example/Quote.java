package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by floodliu on 16/5/16.
 *
 * 该类与外部Service的返回数据(JSON)对应,其格式为:
 *
 * {
 *     "type": xxx,
 *     "value": xxx
 * }
 *
 * 其中,value的值是一个嵌套的JSON格式数据,它的形式由类Value来对应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
