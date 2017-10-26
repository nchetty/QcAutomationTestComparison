
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchMode;


/**
 * <p>Java class for ExpressionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Terms" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfExpression"/>
 *         &lt;element name="SearchMode" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchMode" minOccurs="0"/>
 *         &lt;element name="IsFuzzy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionCriteria", propOrder = {
    "terms",
    "searchMode",
    "isFuzzy"
})
public class ExpressionCriteria {

    @XmlElement(name = "Terms", required = true, nillable = true)
    protected ArrayOfExpression terms;
    @XmlElement(name = "SearchMode")
    @XmlSchemaType(name = "string")
    protected SearchMode searchMode;
    @XmlElement(name = "IsFuzzy")
    protected Boolean isFuzzy;

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpression }
     *     
     */
    public ArrayOfExpression getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpression }
     *     
     */
    public void setTerms(ArrayOfExpression value) {
        this.terms = value;
    }

    /**
     * Gets the value of the searchMode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMode }
     *     
     */
    public SearchMode getSearchMode() {
        return searchMode;
    }

    /**
     * Sets the value of the searchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMode }
     *     
     */
    public void setSearchMode(SearchMode value) {
        this.searchMode = value;
    }

    /**
     * Gets the value of the isFuzzy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFuzzy() {
        return isFuzzy;
    }

    /**
     * Sets the value of the isFuzzy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFuzzy(Boolean value) {
        this.isFuzzy = value;
    }

}
