
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostOrIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseTarget", propOrder = {
    "hostOrIp",
    "port"
})
public class DatabaseTarget {

    @XmlElement(name = "HostOrIp", required = true, nillable = true)
    protected String hostOrIp;
    @XmlElement(name = "Port")
    protected int port;

    /**
     * Gets the value of the hostOrIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostOrIp() {
        return hostOrIp;
    }

    /**
     * Sets the value of the hostOrIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostOrIp(String value) {
        this.hostOrIp = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

}
