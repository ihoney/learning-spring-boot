package com.floodliu;

import com.floodliu.wsdl.GetCityForecastByZIPResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = SpringApplication.run(WeatherConfiguration.class, args);
        WeatherClient weatherClient = applicationContext.getBean(WeatherClient.class);
        String zipCode = "94304";
        if (args.length > 0) {
            zipCode = args[0];
        }

        GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
        weatherClient.printResponse(response);
    }
}
