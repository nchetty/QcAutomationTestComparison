
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalSearchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalSearchOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalSourceBuffers" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfExternalSourceBufferSizes" minOccurs="0"/>
 *         &lt;element name="UseScalingRelevance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxExternalRelevancePercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckSecondaryBlobStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalSearchOptions", propOrder = {
    "externalSourceBuffers",
    "useScalingRelevance",
    "maxExternalRelevancePercentage",
    "checkSecondaryBlobStorage"
})
public class ExternalSearchOptions {

    @XmlElement(name = "ExternalSourceBuffers", nillable = true)
    protected ArrayOfExternalSourceBufferSizes externalSourceBuffers;
    @XmlElement(name = "UseScalingRelevance")
    protected Boolean useScalingRelevance;
    @XmlElement(name = "MaxExternalRelevancePercentage")
    protected Integer maxExternalRelevancePercentage;
    @XmlElement(name = "CheckSecondaryBlobStorage")
    protected Boolean checkSecondaryBlobStorage;

    /**
     * Gets the value of the externalSourceBuffers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExternalSourceBufferSizes }
     *     
     */
    public ArrayOfExternalSourceBufferSizes getExternalSourceBuffers() {
        return externalSourceBuffers;
    }

    /**
     * Sets the value of the externalSourceBuffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExternalSourceBufferSizes }
     *     
     */
    public void setExternalSourceBuffers(ArrayOfExternalSourceBufferSizes value) {
        this.externalSourceBuffers = value;
    }

    /**
     * Gets the value of the useScalingRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseScalingRelevance() {
        return useScalingRelevance;
    }

    /**
     * Sets the value of the useScalingRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseScalingRelevance(Boolean value) {
        this.useScalingRelevance = value;
    }

    /**
     * Gets the value of the maxExternalRelevancePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxExternalRelevancePercentage() {
        return maxExternalRelevancePercentage;
    }

    /**
     * Sets the value of the maxExternalRelevancePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxExternalRelevancePercentage(Integer value) {
        this.maxExternalRelevancePercentage = value;
    }

    /**
     * Gets the value of the checkSecondaryBlobStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckSecondaryBlobStorage() {
        return checkSecondaryBlobStorage;
    }

    /**
     * Sets the value of the checkSecondaryBlobStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckSecondaryBlobStorage(Boolean value) {
        this.checkSecondaryBlobStorage = value;
    }

}
