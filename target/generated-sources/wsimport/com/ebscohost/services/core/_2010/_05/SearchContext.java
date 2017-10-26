
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
 * <p>Java class for SearchContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextFlags" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchContextFlags" minOccurs="0"/>
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TreatMixedBooleansAsLiterals" type="{http://www.ebscohost.com/services/core/2010/05}SearchContextTreatMixedBooleansAsLiterals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchContext", propOrder = {
    "contextFlags",
    "context",
    "treatMixedBooleansAsLiterals"
})
public class SearchContext {

    @XmlList
    @XmlElement(name = "ContextFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> contextFlags;
    @XmlElement(name = "Context", nillable = true)
    protected String context;
    @XmlElement(name = "TreatMixedBooleansAsLiterals", nillable = true)
    protected SearchContextTreatMixedBooleansAsLiterals treatMixedBooleansAsLiterals;

    /**
     * Gets the value of the contextFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContextFlags() {
        if (contextFlags == null) {
            contextFlags = new ArrayList<String>();
        }
        return this.contextFlags;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the treatMixedBooleansAsLiterals property.
     * 
     * @return
     *     possible object is
     *     {@link SearchContextTreatMixedBooleansAsLiterals }
     *     
     */
    public SearchContextTreatMixedBooleansAsLiterals getTreatMixedBooleansAsLiterals() {
        return treatMixedBooleansAsLiterals;
    }

    /**
     * Sets the value of the treatMixedBooleansAsLiterals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchContextTreatMixedBooleansAsLiterals }
     *     
     */
    public void setTreatMixedBooleansAsLiterals(SearchContextTreatMixedBooleansAsLiterals value) {
        this.treatMixedBooleansAsLiterals = value;
    }

}
