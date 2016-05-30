package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by floodliu on 16/5/31.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    /*
     * setUseSuffixPatternMatch
     *      默认为true。即 GET /player/1 与 GET /player/1.1 被认为是相同的。
     *      设为false之后, 参数中的 "1" 和 "1.1" 被认为是不同的。
     *
     * setUseTrailingSlashMatch
     *      默认为true。即 GET /player/1 与 GET /player/1/ 被认为是相同的。
     *      设为false之后, 末尾的斜线将不会被忽略, "1" 和 "1/" 被认为是不同的参数。
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(false);
    }
}
