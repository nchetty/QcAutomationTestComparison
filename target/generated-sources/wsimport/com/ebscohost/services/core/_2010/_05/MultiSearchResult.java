
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.MultiSearchCriteriaType;


/**
 * <p>Java class for MultiSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}MultiSearchCriteriaType"/>
 *         &lt;element name="ResultSetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Expires" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration"/>
 *         &lt;element name="Diagnostics" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSearchResult", propOrder = {
    "label",
    "type",
    "resultSetID",
    "expires",
    "diagnostics"
})
public class MultiSearchResult {

    @XmlElement(name = "Label", required = true, nillable = true)
    protected String label;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected MultiSearchCriteriaType type;
    @XmlElement(name = "ResultSetID", required = true, nillable = true)
    protected String resultSetID;
    @XmlElement(name = "Expires", required = true)
    protected Duration expires;
    @XmlElement(name = "Diagnostics", nillable = true)
    protected DiagnosticResponse diagnostics;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSearchCriteriaType }
     *     
     */
    public MultiSearchCriteriaType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSearchCriteriaType }
     *     
     */
    public void setType(MultiSearchCriteriaType value) {
        this.type = value;
    }

    /**
     * Gets the value of the resultSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetID() {
        return resultSetID;
    }

    /**
     * Sets the value of the resultSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetID(String value) {
        this.resultSetID = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpires(Duration value) {
        this.expires = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResponse }
     *     
     */
    public DiagnosticResponse getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResponse }
     *     
     */
    public void setDiagnostics(DiagnosticResponse value) {
        this.diagnostics = value;
    }

}
