
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchConceptType;


/**
 * <p>Java class for SearchConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchConcept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchConceptType"/>
 *         &lt;element name="Concept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchConcept", propOrder = {
    "type",
    "concept"
})
public class SearchConcept {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected SearchConceptType type;
    @XmlElement(name = "Concept", required = true, nillable = true)
    protected String concept;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchConceptType }
     *     
     */
    public SearchConceptType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchConceptType }
     *     
     */
    public void setType(SearchConceptType value) {
        this.type = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

}
