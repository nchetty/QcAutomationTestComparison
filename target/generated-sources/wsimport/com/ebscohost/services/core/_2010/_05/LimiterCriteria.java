
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimiterCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimiterCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LimiterScreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IncludeLocalLimiters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CommonLimiters" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfLimiterItem" minOccurs="0"/>
 *         &lt;element name="DatabaseLimiters" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfDatabaseLimiters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimiterCriteria", propOrder = {
    "limiterScreen",
    "includeLocalLimiters",
    "commonLimiters",
    "databaseLimiters"
})
public class LimiterCriteria {

    @XmlElement(name = "LimiterScreen", required = true, nillable = true)
    protected String limiterScreen;
    @XmlElement(name = "IncludeLocalLimiters")
    protected boolean includeLocalLimiters;
    @XmlElement(name = "CommonLimiters", nillable = true)
    protected ArrayOfLimiterItem commonLimiters;
    @XmlElement(name = "DatabaseLimiters", nillable = true)
    protected ArrayOfDatabaseLimiters databaseLimiters;

    /**
     * Gets the value of the limiterScreen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiterScreen() {
        return limiterScreen;
    }

    /**
     * Sets the value of the limiterScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiterScreen(String value) {
        this.limiterScreen = value;
    }

    /**
     * Gets the value of the includeLocalLimiters property.
     * 
     */
    public boolean isIncludeLocalLimiters() {
        return includeLocalLimiters;
    }

    /**
     * Sets the value of the includeLocalLimiters property.
     * 
     */
    public void setIncludeLocalLimiters(boolean value) {
        this.includeLocalLimiters = value;
    }

    /**
     * Gets the value of the commonLimiters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLimiterItem }
     *     
     */
    public ArrayOfLimiterItem getCommonLimiters() {
        return commonLimiters;
    }

    /**
     * Sets the value of the commonLimiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLimiterItem }
     *     
     */
    public void setCommonLimiters(ArrayOfLimiterItem value) {
        this.commonLimiters = value;
    }

    /**
     * Gets the value of the databaseLimiters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatabaseLimiters }
     *     
     */
    public ArrayOfDatabaseLimiters getDatabaseLimiters() {
        return databaseLimiters;
    }

    /**
     * Sets the value of the databaseLimiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatabaseLimiters }
     *     
     */
    public void setDatabaseLimiters(ArrayOfDatabaseLimiters value) {
        this.databaseLimiters = value;
    }

}
