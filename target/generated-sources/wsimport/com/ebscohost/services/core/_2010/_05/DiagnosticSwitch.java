
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.DiagnosticLevel;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.DiagnosticSource;


/**
 * <p>Java class for DiagnosticSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticSwitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}DiagnosticSource"/>
 *         &lt;element name="Level" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}DiagnosticLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticSwitch", propOrder = {
    "source",
    "level"
})
public class DiagnosticSwitch {

    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosticSource source;
    @XmlElement(name = "Level", required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosticLevel level;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticSource }
     *     
     */
    public DiagnosticSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticSource }
     *     
     */
    public void setSource(DiagnosticSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticLevel }
     *     
     */
    public DiagnosticLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticLevel }
     *     
     */
    public void setLevel(DiagnosticLevel value) {
        this.level = value;
    }

}
