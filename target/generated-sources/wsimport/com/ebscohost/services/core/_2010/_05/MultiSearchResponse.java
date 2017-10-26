
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
 *         &lt;element name="MultiSearchResult" type="{http://www.ebscohost.com/services/core/2010/05}MultiSearchResponseMessage" minOccurs="0"/>
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
    "multiSearchResult"
})
@XmlRootElement(name = "MultiSearchResponse")
public class MultiSearchResponse {

    @XmlElement(name = "MultiSearchResult", nillable = true)
    protected MultiSearchResponseMessage multiSearchResult;

    /**
     * Gets the value of the multiSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSearchResponseMessage }
     *     
     */
    public MultiSearchResponseMessage getMultiSearchResult() {
        return multiSearchResult;
    }

    /**
     * Sets the value of the multiSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSearchResponseMessage }
     *     
     */
    public void setMultiSearchResult(MultiSearchResponseMessage value) {
        this.multiSearchResult = value;
    }

}
