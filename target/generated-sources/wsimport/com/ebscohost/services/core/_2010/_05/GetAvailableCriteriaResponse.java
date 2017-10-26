
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
 *         &lt;element name="GetAvailableCriteriaResult" type="{http://www.ebscohost.com/services/core/2010/05}AvailableCriteriaMessage" minOccurs="0"/>
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
    "getAvailableCriteriaResult"
})
@XmlRootElement(name = "GetAvailableCriteriaResponse")
public class GetAvailableCriteriaResponse {

    @XmlElement(name = "GetAvailableCriteriaResult", nillable = true)
    protected AvailableCriteriaMessage getAvailableCriteriaResult;

    /**
     * Gets the value of the getAvailableCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableCriteriaMessage }
     *     
     */
    public AvailableCriteriaMessage getGetAvailableCriteriaResult() {
        return getAvailableCriteriaResult;
    }

    /**
     * Sets the value of the getAvailableCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableCriteriaMessage }
     *     
     */
    public void setGetAvailableCriteriaResult(AvailableCriteriaMessage value) {
        this.getAvailableCriteriaResult = value;
    }

}
