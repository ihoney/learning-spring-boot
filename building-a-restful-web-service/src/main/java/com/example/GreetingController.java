package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by hongtao on 16/5/16.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
     * 服务接口:
     *      GET /greeting HTTP/1.1
     *      GET /greeting?name=xxx HTTP/1.1
     *
     * 如果查询参数中未提供name参数,则使用默认值"World"。
     *
     * HTTP响应(JSON):
     *
     * {
     *      "id": xxx,
     *      "content": xxx
     * }
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        long id = counter.incrementAndGet();
        String content = String.format(template, name);
        return new Greeting(id, content);
    }
}
