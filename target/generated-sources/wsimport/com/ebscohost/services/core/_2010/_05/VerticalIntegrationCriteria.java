
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.VerticalIntegrationMode;


/**
 * <p>Java class for VerticalIntegrationCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalIntegrationCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}VerticalIntegrationMode"/>
 *         &lt;element name="Threshold" type="{http://www.ebscohost.com/services/core/2010/05}VerticalThresholdCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalIntegrationCriteria", propOrder = {
    "mode",
    "threshold"
})
public class VerticalIntegrationCriteria {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected VerticalIntegrationMode mode;
    @XmlElement(name = "Threshold", required = true, nillable = true)
    protected VerticalThresholdCriteria threshold;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalIntegrationMode }
     *     
     */
    public VerticalIntegrationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalIntegrationMode }
     *     
     */
    public void setMode(VerticalIntegrationMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalThresholdCriteria }
     *     
     */
    public VerticalThresholdCriteria getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalThresholdCriteria }
     *     
     */
    public void setThreshold(VerticalThresholdCriteria value) {
        this.threshold = value;
    }

}
