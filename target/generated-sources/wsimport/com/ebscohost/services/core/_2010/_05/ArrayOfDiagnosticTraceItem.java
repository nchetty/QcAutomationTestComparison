
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDiagnosticTraceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDiagnosticTraceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiagnosticTraceItem" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticTraceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticTraceItem", propOrder = {
    "diagnosticTraceItem"
})
public class ArrayOfDiagnosticTraceItem {

    @XmlElement(name = "DiagnosticTraceItem", nillable = true)
    protected List<DiagnosticTraceItem> diagnosticTraceItem;

    /**
     * Gets the value of the diagnosticTraceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticTraceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticTraceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticTraceItem }
     * 
     * 
     */
    public List<DiagnosticTraceItem> getDiagnosticTraceItem() {
        if (diagnosticTraceItem == null) {
            diagnosticTraceItem = new ArrayList<DiagnosticTraceItem>();
        }
        return this.diagnosticTraceItem;
    }

}
