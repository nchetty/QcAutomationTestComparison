
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
 *         &lt;element name="GetExtendedResultsResult" type="{http://www.ebscohost.com/services/core/2010/05}ExtendedResultsMessage" minOccurs="0"/>
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
    "getExtendedResultsResult"
})
@XmlRootElement(name = "GetExtendedResultsResponse")
public class GetExtendedResultsResponse {

    @XmlElement(name = "GetExtendedResultsResult", nillable = true)
    protected ExtendedResultsMessage getExtendedResultsResult;

    /**
     * Gets the value of the getExtendedResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedResultsMessage }
     *     
     */
    public ExtendedResultsMessage getGetExtendedResultsResult() {
        return getExtendedResultsResult;
    }

    /**
     * Sets the value of the getExtendedResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedResultsMessage }
     *     
     */
    public void setGetExtendedResultsResult(ExtendedResultsMessage value) {
        this.getExtendedResultsResult = value;
    }

}
