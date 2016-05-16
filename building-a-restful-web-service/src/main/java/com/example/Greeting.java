package com.example;

/**
 * Created by hongtao on 16/5/16.
 *
 * 该类定义了HTTP响应的数据格式,对应的JSON格式如下:
 *
 * {
 *     "id": 1,
 *     "content": "Hello, World"
 * }
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
