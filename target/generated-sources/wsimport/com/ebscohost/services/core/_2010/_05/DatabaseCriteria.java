
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for DatabaseCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedDatabases" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="OriginalDatabases" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ReferenceDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionCriteria" type="{http://www.ebscohost.com/services/core/2010/05}DatabaseExtensionCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseCriteria", propOrder = {
    "selectedDatabases",
    "originalDatabases",
    "referenceDatabase",
    "extensionCriteria"
})
public class DatabaseCriteria {

    @XmlElement(name = "SelectedDatabases", nillable = true)
    protected ArrayOfstring selectedDatabases;
    @XmlElement(name = "OriginalDatabases", nillable = true)
    protected ArrayOfstring originalDatabases;
    @XmlElement(name = "ReferenceDatabase", nillable = true)
    protected String referenceDatabase;
    @XmlElement(name = "ExtensionCriteria", nillable = true)
    protected DatabaseExtensionCriteria extensionCriteria;

    /**
     * Gets the value of the selectedDatabases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSelectedDatabases() {
        return selectedDatabases;
    }

    /**
     * Sets the value of the selectedDatabases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSelectedDatabases(ArrayOfstring value) {
        this.selectedDatabases = value;
    }

    /**
     * Gets the value of the originalDatabases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOriginalDatabases() {
        return originalDatabases;
    }

    /**
     * Sets the value of the originalDatabases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOriginalDatabases(ArrayOfstring value) {
        this.originalDatabases = value;
    }

    /**
     * Gets the value of the referenceDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDatabase() {
        return referenceDatabase;
    }

    /**
     * Sets the value of the referenceDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDatabase(String value) {
        this.referenceDatabase = value;
    }

    /**
     * Gets the value of the extensionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseExtensionCriteria }
     *     
     */
    public DatabaseExtensionCriteria getExtensionCriteria() {
        return extensionCriteria;
    }

    /**
     * Sets the value of the extensionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseExtensionCriteria }
     *     
     */
    public void setExtensionCriteria(DatabaseExtensionCriteria value) {
        this.extensionCriteria = value;
    }

}
