//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.04.21 时间 05:30:37 PM CST 
//


package com.floodliu.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCityWeatherByZIPResult" type="{http://ws.cdyne.com/WeatherWS/}WeatherReturn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCityWeatherByZIPResult"
})
@XmlRootElement(name = "GetCityWeatherByZIPResponse")
public class GetCityWeatherByZIPResponse {

    @XmlElement(name = "GetCityWeatherByZIPResult", required = true)
    protected WeatherReturn getCityWeatherByZIPResult;

    /**
     * 获取getCityWeatherByZIPResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeatherReturn }
     *     
     */
    public WeatherReturn getGetCityWeatherByZIPResult() {
        return getCityWeatherByZIPResult;
    }

    /**
     * 设置getCityWeatherByZIPResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherReturn }
     *     
     */
    public void setGetCityWeatherByZIPResult(WeatherReturn value) {
        this.getCityWeatherByZIPResult = value;
    }

}
