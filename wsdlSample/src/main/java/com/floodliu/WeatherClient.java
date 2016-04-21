package com.floodliu;

import com.floodliu.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 * Created by hongtao on 16/4/21.
 */
public class WeatherClient extends WebServiceGatewaySupport {

    private Logger logger = Logger.getLogger(WeatherClient.class.getName());

    GetCityForecastByZIPResponse getCityForecastByZip(String zipCode) {
        GetCityForecastByZIP request = new GetCityForecastByZIP();
        request.setZIP(zipCode);

        logger.info("Requesting forecast for " + zipCode);

        GetCityForecastByZIPResponse response = (GetCityForecastByZIPResponse) getWebServiceTemplate().marshalSendAndReceive(
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
                logger.info(dateFormat.format(forecast.getDate().toGregorianCalendar().getTime()));
                logger.info(forecast.getDesciption());
                Temp temperature = forecast.getTemperatures();
                logger.info(temperature.getMorningLow() + "\u00b0-" + temperature.getDaytimeHigh() + "\u00b0 ");
            }
        } else {
            logger.info("No forecast received");
        }
    }
}
