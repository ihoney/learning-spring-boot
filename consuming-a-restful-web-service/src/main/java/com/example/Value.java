package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by floodliu on 16/5/16.
 *
 * 该类与外部Service的返回数据(JSON)的value域对应。其格式为:
 *
 * {
 *     "id": xxx,
 *     "quote": xxx
 * }
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
