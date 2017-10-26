
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedResultsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedResultsMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.ebscohost.com/services/core/2010/05}ExtendedResults"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedResultsMessage", propOrder = {
    "results"
})
public class ExtendedResultsMessage {

    @XmlElement(name = "Results", required = true, nillable = true)
    protected ExtendedResults results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedResults }
     *     
     */
    public ExtendedResults getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedResults }
     *     
     */
    public void setResults(ExtendedResults value) {
        this.results = value;
    }

}
