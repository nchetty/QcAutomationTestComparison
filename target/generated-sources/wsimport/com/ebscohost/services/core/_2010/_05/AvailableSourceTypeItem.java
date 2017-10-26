
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableSourceTypeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableSourceTypeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceTypeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableSourceTypeItem", propOrder = {
    "sourceTypeID",
    "count"
})
public class AvailableSourceTypeItem {

    @XmlElement(name = "SourceTypeID", required = true, nillable = true)
    protected String sourceTypeID;
    @XmlElement(name = "Count")
    protected Integer count;

    /**
     * Gets the value of the sourceTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTypeID() {
        return sourceTypeID;
    }

    /**
     * Sets the value of the sourceTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTypeID(String value) {
        this.sourceTypeID = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
