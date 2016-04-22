package com.floodliu;

import com.floodliu.wsdl.*;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hongtao on 16/4/21.
 */
public class WeatherClient extends WebServiceGatewaySupport {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WeatherClient.class);

    GetCityForecastByZIPResponse getCityForecastByZip(String zipCode) {
        GetCityForecastByZIP request = new GetCityForecastByZIP();
        request.setZIP(zipCode);

        logger.info("Requesting forecast for " + zipCode);

        GetCityForecastByZIPResponse response = (GetCityForecastByZIPResponse) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "http://wsf.cdyne.com/WeatherWS/Weather.asmx",
                        request,
                        new SoapActionCallback("http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP")
        );
        return response;
    }

    public void printResponse(GetCityForecastByZIPResponse response) {
        ForecastReturn forecastReturn = response.getGetCityForecastByZIPResult();

        if (forecastReturn.isSuccess()) {
            logger.info("Forecast for " + forecastReturn.getCity() + ", " + forecastReturn.getState());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            for (Forecast forecast : forecastReturn.getForecastResult().getForecast()) {
                Temp temperature = forecast.getTemperatures();
                Date date = forecast.getDate().toGregorianCalendar().getTime();
                String desc = forecast.getDesciption();
                String low  = temperature.getMorningLow();
                String high = temperature.getDaytimeHigh();
                logger.info(String.format("%s %s %s-%s", dateFormat.format(date), desc, low, high));
                logger.info("");
            }
        } else {
            logger.info("No forecast received");
        }
    }
}
