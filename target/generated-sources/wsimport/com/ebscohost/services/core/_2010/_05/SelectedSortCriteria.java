
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedSortCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedSortCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedSortCriteria", propOrder = {
    "sortID"
})
public class SelectedSortCriteria {

    @XmlElement(name = "SortID", required = true, nillable = true)
    protected String sortID;

    /**
     * Gets the value of the sortID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortID() {
        return sortID;
    }

    /**
     * Sets the value of the sortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortID(String value) {
        this.sortID = value;
    }

}
