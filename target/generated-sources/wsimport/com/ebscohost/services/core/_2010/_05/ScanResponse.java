
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ScanResult" type="{http://www.ebscohost.com/services/core/2010/05}ScanResponseMessage" minOccurs="0"/>
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
    "scanResult"
})
@XmlRootElement(name = "ScanResponse")
public class ScanResponse {

    @XmlElement(name = "ScanResult", nillable = true)
    protected ScanResponseMessage scanResult;

    /**
     * Gets the value of the scanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScanResponseMessage }
     *     
     */
    public ScanResponseMessage getScanResult() {
        return scanResult;
    }

    /**
     * Sets the value of the scanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanResponseMessage }
     *     
     */
    public void setScanResult(ScanResponseMessage value) {
        this.scanResult = value;
    }

}
