//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 02:05:00 PM CET 
//


package com.carcaret.trx.console.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalStats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StartAt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SuccessClientAvg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="SuccessClientMin" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="SuccessClientMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="SuccessServerAvg" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="SuccessServerMin" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="SuccessServerMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="SuccessCounter" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="RequesterErrorCounter" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="ResponderErrorCounter" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="LastRequest" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ClientProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="ServerProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "globalStats",
    "service"
})
@XmlRootElement(name = "TxStatistics")
public class TxStatistics {

    @XmlElement(name = "GlobalStats", required = true)
    protected TxStatistics.GlobalStats globalStats;
    @XmlElement(name = "Service")
    protected List<TxStatistics.Service> service;

    /**
     * Gets the value of the globalStats property.
     * 
     * @return
     *     possible object is
     *     {@link TxStatistics.GlobalStats }
     *     
     */
    public TxStatistics.GlobalStats getGlobalStats() {
        return globalStats;
    }

    /**
     * Sets the value of the globalStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxStatistics.GlobalStats }
     *     
     */
    public void setGlobalStats(TxStatistics.GlobalStats value) {
        this.globalStats = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxStatistics.Service }
     * 
     * 
     */
    public List<TxStatistics.Service> getService() {
        if (service == null) {
            service = new ArrayList<TxStatistics.Service>();
        }
        return this.service;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StartAt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startAt"
    })
    public static class GlobalStats {

        @XmlElement(name = "StartAt", required = true)
        protected String startAt;

        /**
         * Gets the value of the startAt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartAt() {
            return startAt;
        }

        /**
         * Sets the value of the startAt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartAt(String value) {
            this.startAt = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SuccessClientAvg" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="SuccessClientMin" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="SuccessClientMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="SuccessServerAvg" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="SuccessServerMin" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="SuccessServerMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="SuccessCounter" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="RequesterErrorCounter" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="ResponderErrorCounter" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="LastRequest" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ClientProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="ServerProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Service {

        @XmlElementRefs({
            @XmlElementRef(name = "SuccessServerAvg", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessClientMin", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessServerMax", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessServerMin", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "LastRequest", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "RequesterErrorCounter", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessCounter", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessClientMax", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "ResponderErrorCounter", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class),
            @XmlElementRef(name = "SuccessClientAvg", namespace = "http://www.safelayer.com/TWS", type = JAXBElement.class)
        })
        @XmlMixed
        protected List<Serializable> content;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Byte }{@code >}
         * {@link JAXBElement }{@code <}{@link Byte }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link TxStatistics.Service.LastRequest }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Byte }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ClientProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="ServerProcessingTime" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "success",
            "finishTime",
            "result",
            "clientProcessingTime",
            "serverProcessingTime"
        })
        public static class LastRequest {

            @XmlElement(name = "Success", required = true)
            protected String success;
            @XmlElement(name = "FinishTime", required = true)
            protected String finishTime;
            @XmlElement(name = "Result", required = true)
            protected String result;
            @XmlElement(name = "ClientProcessingTime")
            protected short clientProcessingTime;
            @XmlElement(name = "ServerProcessingTime")
            protected short serverProcessingTime;

            /**
             * Gets the value of the success property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuccess() {
                return success;
            }

            /**
             * Sets the value of the success property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuccess(String value) {
                this.success = value;
            }

            /**
             * Gets the value of the finishTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinishTime() {
                return finishTime;
            }

            /**
             * Sets the value of the finishTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinishTime(String value) {
                this.finishTime = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult(String value) {
                this.result = value;
            }

            /**
             * Gets the value of the clientProcessingTime property.
             * 
             */
            public short getClientProcessingTime() {
                return clientProcessingTime;
            }

            /**
             * Sets the value of the clientProcessingTime property.
             * 
             */
            public void setClientProcessingTime(short value) {
                this.clientProcessingTime = value;
            }

            /**
             * Gets the value of the serverProcessingTime property.
             * 
             */
            public short getServerProcessingTime() {
                return serverProcessingTime;
            }

            /**
             * Sets the value of the serverProcessingTime property.
             * 
             */
            public void setServerProcessingTime(short value) {
                this.serverProcessingTime = value;
            }

        }

    }

}