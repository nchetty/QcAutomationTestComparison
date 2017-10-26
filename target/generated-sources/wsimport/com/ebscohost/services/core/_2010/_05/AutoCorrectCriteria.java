
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.CorrectionStrategy;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.ZeroHitStrategy;


/**
 * <p>Java class for AutoCorrectCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoCorrectCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectionStrategy" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}CorrectionStrategy" minOccurs="0"/>
 *         &lt;element name="ZeroHitStrategy" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}ZeroHitStrategy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoCorrectCriteria", propOrder = {
    "enable",
    "correctionStrategy",
    "zeroHitStrategy"
})
public class AutoCorrectCriteria {

    @XmlElement(name = "Enable")
    protected Boolean enable;
    @XmlElement(name = "CorrectionStrategy")
    @XmlSchemaType(name = "string")
    protected CorrectionStrategy correctionStrategy;
    @XmlElement(name = "ZeroHitStrategy")
    @XmlSchemaType(name = "string")
    protected ZeroHitStrategy zeroHitStrategy;

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnable(Boolean value) {
        this.enable = value;
    }

    /**
     * Gets the value of the correctionStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionStrategy }
     *     
     */
    public CorrectionStrategy getCorrectionStrategy() {
        return correctionStrategy;
    }

    /**
     * Sets the value of the correctionStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionStrategy }
     *     
     */
    public void setCorrectionStrategy(CorrectionStrategy value) {
        this.correctionStrategy = value;
    }

    /**
     * Gets the value of the zeroHitStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroHitStrategy }
     *     
     */
    public ZeroHitStrategy getZeroHitStrategy() {
        return zeroHitStrategy;
    }

    /**
     * Sets the value of the zeroHitStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroHitStrategy }
     *     
     */
    public void setZeroHitStrategy(ZeroHitStrategy value) {
        this.zeroHitStrategy = value;
    }

}
