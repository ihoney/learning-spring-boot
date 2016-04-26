package com.example.bookpub;

import com.example.bookpub.formatter.BookFormatter;
import com.example.bookpub.repository.BookRepository;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Created by hongtao on 16/4/26.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

//    @Bean
//    public RemoteIpFilter remoteIpFilter() {
//        return new RemoteIpFilter();
//    }
//
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        return new LocaleChangeInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(localeChangeInterceptor());
//    }
//
//    @Bean
//    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
//        return new ByteArrayHttpMessageConverter();
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new ByteArrayHttpMessageConverter());
//    }
//
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.clear();
//        converters.add(new ByteArrayHttpMessageConverter());
//    }

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new BookFormatter(bookRepository));
    }

//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(true);
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/internal/**").addResourceLocations("classpath:/");
    }
}
