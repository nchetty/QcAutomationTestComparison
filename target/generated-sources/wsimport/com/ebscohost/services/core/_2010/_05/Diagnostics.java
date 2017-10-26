
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diagnostics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diagnostics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switches" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfDiagnosticSwitch" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}DiagnosticDestination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostics", propOrder = {
    "switches",
    "destination"
})
public class Diagnostics {

    @XmlElement(name = "Switches", nillable = true)
    protected ArrayOfDiagnosticSwitch switches;
    @XmlList
    @XmlElement(name = "Destination")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> destination;

    /**
     * Gets the value of the switches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticSwitch }
     *     
     */
    public ArrayOfDiagnosticSwitch getSwitches() {
        return switches;
    }

    /**
     * Sets the value of the switches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticSwitch }
     *     
     */
    public void setSwitches(ArrayOfDiagnosticSwitch value) {
        this.switches = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDestination() {
        if (destination == null) {
            destination = new ArrayList<String>();
        }
        return this.destination;
    }

}
