
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for SelectedSourceTypeCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedSourceTypeCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestrictedParentSourceTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SelectedChildSourceTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="AutoSelectFirstChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoSelectOnlyChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedSourceTypeCriteria", propOrder = {
    "restrictedParentSourceTypes",
    "selectedChildSourceTypes",
    "autoSelectFirstChild",
    "autoSelectOnlyChild"
})
public class SelectedSourceTypeCriteria {

    @XmlElement(name = "RestrictedParentSourceTypes", nillable = true)
    protected ArrayOfstring restrictedParentSourceTypes;
    @XmlElement(name = "SelectedChildSourceTypes", nillable = true)
    protected ArrayOfstring selectedChildSourceTypes;
    @XmlElement(name = "AutoSelectFirstChild")
    protected Boolean autoSelectFirstChild;
    @XmlElement(name = "AutoSelectOnlyChild")
    protected Boolean autoSelectOnlyChild;

    /**
     * Gets the value of the restrictedParentSourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRestrictedParentSourceTypes() {
        return restrictedParentSourceTypes;
    }

    /**
     * Sets the value of the restrictedParentSourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRestrictedParentSourceTypes(ArrayOfstring value) {
        this.restrictedParentSourceTypes = value;
    }

    /**
     * Gets the value of the selectedChildSourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSelectedChildSourceTypes() {
        return selectedChildSourceTypes;
    }

    /**
     * Sets the value of the selectedChildSourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSelectedChildSourceTypes(ArrayOfstring value) {
        this.selectedChildSourceTypes = value;
    }

    /**
     * Gets the value of the autoSelectFirstChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSelectFirstChild() {
        return autoSelectFirstChild;
    }

    /**
     * Sets the value of the autoSelectFirstChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSelectFirstChild(Boolean value) {
        this.autoSelectFirstChild = value;
    }

    /**
     * Gets the value of the autoSelectOnlyChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSelectOnlyChild() {
        return autoSelectOnlyChild;
    }

    /**
     * Sets the value of the autoSelectOnlyChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSelectOnlyChild(Boolean value) {
        this.autoSelectOnlyChild = value;
    }

}
