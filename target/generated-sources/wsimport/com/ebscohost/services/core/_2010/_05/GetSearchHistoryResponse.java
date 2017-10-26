
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
 *         &lt;element name="GetSearchHistoryResult" type="{http://www.ebscohost.com/services/core/2010/05}SearchHistoryMessage" minOccurs="0"/>
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
    "getSearchHistoryResult"
})
@XmlRootElement(name = "GetSearchHistoryResponse")
public class GetSearchHistoryResponse {

    @XmlElement(name = "GetSearchHistoryResult", nillable = true)
    protected SearchHistoryMessage getSearchHistoryResult;

    /**
     * Gets the value of the getSearchHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchHistoryMessage }
     *     
     */
    public SearchHistoryMessage getGetSearchHistoryResult() {
        return getSearchHistoryResult;
    }

    /**
     * Sets the value of the getSearchHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHistoryMessage }
     *     
     */
    public void setGetSearchHistoryResult(SearchHistoryMessage value) {
        this.getSearchHistoryResult = value;
    }

}
