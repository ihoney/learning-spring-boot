//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.04.21 时间 08:31:49 PM CST 
//


package com.floodliu.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>temp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="temp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MorningLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaytimeHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temp", propOrder = {
    "morningLow",
    "daytimeHigh"
})
public class Temp {

    @XmlElement(name = "MorningLow")
    protected String morningLow;
    @XmlElement(name = "DaytimeHigh")
    protected String daytimeHigh;

    /**
     * 获取morningLow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorningLow() {
        return morningLow;
    }

    /**
     * 设置morningLow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorningLow(String value) {
        this.morningLow = value;
    }

    /**
     * 获取daytimeHigh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaytimeHigh() {
        return daytimeHigh;
    }

    /**
     * 设置daytimeHigh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaytimeHigh(String value) {
        this.daytimeHigh = value;
    }

}