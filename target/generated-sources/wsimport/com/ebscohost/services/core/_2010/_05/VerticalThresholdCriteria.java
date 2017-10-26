
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.VerticalThresholdType;


/**
 * <p>Java class for VerticalThresholdCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalThresholdCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThresholdType" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}VerticalThresholdType"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalThresholdCriteria", propOrder = {
    "thresholdType",
    "value"
})
public class VerticalThresholdCriteria {

    @XmlElement(name = "ThresholdType", required = true)
    @XmlSchemaType(name = "string")
    protected VerticalThresholdType thresholdType;
    @XmlElement(name = "Value")
    protected double value;

    /**
     * Gets the value of the thresholdType property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalThresholdType }
     *     
     */
    public VerticalThresholdType getThresholdType() {
        return thresholdType;
    }

    /**
     * Sets the value of the thresholdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalThresholdType }
     *     
     */
    public void setThresholdType(VerticalThresholdType value) {
        this.thresholdType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
