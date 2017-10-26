
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseExtensionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseExtensionCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseSelectedProfileDatabases" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Extensions" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfDatabaseExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseExtensionCriteria", propOrder = {
    "useSelectedProfileDatabases",
    "extensions"
})
public class DatabaseExtensionCriteria {

    @XmlElement(name = "UseSelectedProfileDatabases")
    protected boolean useSelectedProfileDatabases;
    @XmlElement(name = "Extensions", nillable = true)
    protected ArrayOfDatabaseExtension extensions;

    /**
     * Gets the value of the useSelectedProfileDatabases property.
     * 
     */
    public boolean isUseSelectedProfileDatabases() {
        return useSelectedProfileDatabases;
    }

    /**
     * Sets the value of the useSelectedProfileDatabases property.
     * 
     */
    public void setUseSelectedProfileDatabases(boolean value) {
        this.useSelectedProfileDatabases = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatabaseExtension }
     *     
     */
    public ArrayOfDatabaseExtension getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatabaseExtension }
     *     
     */
    public void setExtensions(ArrayOfDatabaseExtension value) {
        this.extensions = value;
    }

}
