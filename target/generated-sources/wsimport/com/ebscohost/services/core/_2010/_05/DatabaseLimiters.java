
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseLimiters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseLimiters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Database" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Limiters" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfLimiterItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseLimiters", propOrder = {
    "database",
    "limiters"
})
public class DatabaseLimiters {

    @XmlElement(name = "Database", required = true, nillable = true)
    protected String database;
    @XmlElement(name = "Limiters", required = true, nillable = true)
    protected ArrayOfLimiterItem limiters;

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the limiters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLimiterItem }
     *     
     */
    public ArrayOfLimiterItem getLimiters() {
        return limiters;
    }

    /**
     * Sets the value of the limiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLimiterItem }
     *     
     */
    public void setLimiters(ArrayOfLimiterItem value) {
        this.limiters = value;
    }

}
