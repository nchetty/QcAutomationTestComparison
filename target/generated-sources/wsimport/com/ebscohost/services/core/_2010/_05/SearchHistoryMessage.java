
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchHistoryMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchHistoryMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="History" type="{http://www.ebscohost.com/services/core/2010/05}SearchHistory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchHistoryMessage", propOrder = {
    "history"
})
public class SearchHistoryMessage {

    @XmlElement(name = "History", required = true, nillable = true)
    protected SearchHistory history;

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link SearchHistory }
     *     
     */
    public SearchHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHistory }
     *     
     */
    public void setHistory(SearchHistory value) {
        this.history = value;
    }

}
