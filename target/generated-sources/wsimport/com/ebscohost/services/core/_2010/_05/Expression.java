
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.ExpressionOperator;


/**
 * <p>Java class for Expression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Expression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}ExpressionOperator" minOccurs="0"/>
 *         &lt;element name="Concept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Expression", propOrder = {
    "term",
    "tag",
    "operator",
    "concept"
})
public class Expression {

    @XmlElement(name = "Term", required = true, nillable = true)
    protected String term;
    @XmlElement(name = "Tag", nillable = true)
    protected String tag;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected ExpressionOperator operator;
    @XmlElement(name = "Concept", nillable = true)
    protected String concept;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionOperator }
     *     
     */
    public ExpressionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionOperator }
     *     
     */
    public void setOperator(ExpressionOperator value) {
        this.operator = value;
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
