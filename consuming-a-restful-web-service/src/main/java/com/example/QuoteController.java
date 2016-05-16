package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by floodliu on 16/5/16.
 */
@RestController
public class QuoteController {

    /*
     * 服务接口:
     *      GET /quote HTTP/1.1
     *
     * HTTP响应:
     *      从第三方服务中获取数据(JSON格式,与Quote类对应)。
     */
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getRandomQuote() {
        RestTemplate template = new RestTemplate();
        String serviceUrl = "http://gturnquist-quoters.cfapps.io/api/random";
        Quote quote = template.getForObject(serviceUrl, Quote.class);
        return quote;
    }
}
