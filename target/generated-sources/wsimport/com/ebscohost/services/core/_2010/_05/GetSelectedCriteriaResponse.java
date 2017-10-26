
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
 *         &lt;element name="GetSelectedCriteriaResult" type="{http://www.ebscohost.com/services/core/2010/05}SelectedCriteriaMessage" minOccurs="0"/>
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
    "getSelectedCriteriaResult"
})
@XmlRootElement(name = "GetSelectedCriteriaResponse")
public class GetSelectedCriteriaResponse {

    @XmlElement(name = "GetSelectedCriteriaResult", nillable = true)
    protected SelectedCriteriaMessage getSelectedCriteriaResult;

    /**
     * Gets the value of the getSelectedCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedCriteriaMessage }
     *     
     */
    public SelectedCriteriaMessage getGetSelectedCriteriaResult() {
        return getSelectedCriteriaResult;
    }

    /**
     * Sets the value of the getSelectedCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedCriteriaMessage }
     *     
     */
    public void setGetSelectedCriteriaResult(SelectedCriteriaMessage value) {
        this.getSelectedCriteriaResult = value;
    }

}
