
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDiagnosticTraceOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDiagnosticTraceOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiagnosticTraceOperation" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticTraceOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticTraceOperation", propOrder = {
    "diagnosticTraceOperation"
})
public class ArrayOfDiagnosticTraceOperation {

    @XmlElement(name = "DiagnosticTraceOperation", nillable = true)
    protected List<DiagnosticTraceOperation> diagnosticTraceOperation;

    /**
     * Gets the value of the diagnosticTraceOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticTraceOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticTraceOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticTraceOperation }
     * 
     * 
     */
    public List<DiagnosticTraceOperation> getDiagnosticTraceOperation() {
        if (diagnosticTraceOperation == null) {
            diagnosticTraceOperation = new ArrayList<DiagnosticTraceOperation>();
        }
        return this.diagnosticTraceOperation;
    }

}
