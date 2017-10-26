
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchHistoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchHistoryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Criteria" type="{http://www.ebscohost.com/services/core/2010/05}SelectedCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchHistoryItem", propOrder = {
    "historyID",
    "criteria"
})
public class SearchHistoryItem {

    @XmlElement(name = "HistoryID", required = true, nillable = true)
    protected String historyID;
    @XmlElement(name = "Criteria", required = true, nillable = true)
    protected SelectedCriteria criteria;

    /**
     * Gets the value of the historyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryID() {
        return historyID;
    }

    /**
     * Sets the value of the historyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryID(String value) {
        this.historyID = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedCriteria }
     *     
     */
    public SelectedCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedCriteria }
     *     
     */
    public void setCriteria(SelectedCriteria value) {
        this.criteria = value;
    }

}
