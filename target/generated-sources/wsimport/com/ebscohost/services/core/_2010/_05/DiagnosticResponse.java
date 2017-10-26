
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfDiagnosticTraceEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticResponse", propOrder = {
    "events"
})
public class DiagnosticResponse {

    @XmlElement(name = "Events", nillable = true)
    protected ArrayOfDiagnosticTraceEvent events;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticTraceEvent }
     *     
     */
    public ArrayOfDiagnosticTraceEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticTraceEvent }
     *     
     */
    public void setEvents(ArrayOfDiagnosticTraceEvent value) {
        this.events = value;
    }

}
