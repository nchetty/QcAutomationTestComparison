
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
 *         &lt;element name="SearchWithInitialRequestResult" type="{http://www.ebscohost.com/services/core/2010/05}SearchWithInitialResponseMessage" minOccurs="0"/>
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
    "searchWithInitialRequestResult"
})
@XmlRootElement(name = "SearchWithInitialRequestResponse")
public class SearchWithInitialRequestResponse {

    @XmlElement(name = "SearchWithInitialRequestResult", nillable = true)
    protected SearchWithInitialResponseMessage searchWithInitialRequestResult;

    /**
     * Gets the value of the searchWithInitialRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchWithInitialResponseMessage }
     *     
     */
    public SearchWithInitialResponseMessage getSearchWithInitialRequestResult() {
        return searchWithInitialRequestResult;
    }

    /**
     * Sets the value of the searchWithInitialRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchWithInitialResponseMessage }
     *     
     */
    public void setSearchWithInitialRequestResult(SearchWithInitialResponseMessage value) {
        this.searchWithInitialRequestResult = value;
    }

}
