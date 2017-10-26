
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigurationOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Target" type="{http://www.ebscohost.com/services/core/2010/05}DatabaseTarget" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseExtension", propOrder = {
    "databaseName",
    "configurationOverride",
    "target"
})
public class DatabaseExtension {

    @XmlElement(name = "DatabaseName", required = true, nillable = true)
    protected String databaseName;
    @XmlElement(name = "ConfigurationOverride", nillable = true)
    protected String configurationOverride;
    @XmlElement(name = "Target", nillable = true)
    protected DatabaseTarget target;

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the configurationOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationOverride() {
        return configurationOverride;
    }

    /**
     * Sets the value of the configurationOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationOverride(String value) {
        this.configurationOverride = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseTarget }
     *     
     */
    public DatabaseTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseTarget }
     *     
     */
    public void setTarget(DatabaseTarget value) {
        this.target = value;
    }

}
