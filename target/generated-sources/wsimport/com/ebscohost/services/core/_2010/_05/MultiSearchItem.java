
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.MultiSearchCriteriaType;


/**
 * <p>Java class for MultiSearchItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSearchItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}MultiSearchCriteriaType"/>
 *         &lt;element name="Criteria" type="{http://www.ebscohost.com/services/core/2010/05}SearchCriteria"/>
 *         &lt;element name="Calculations" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchCalculations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSearchItem", propOrder = {
    "label",
    "type",
    "criteria",
    "calculations"
})
public class MultiSearchItem {

    @XmlElement(name = "Label", required = true, nillable = true)
    protected String label;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected MultiSearchCriteriaType type;
    @XmlElement(name = "Criteria", required = true, nillable = true)
    protected SearchCriteria criteria;
    @XmlList
    @XmlElement(name = "Calculations")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> calculations;

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
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setCriteria(SearchCriteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the calculations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCalculations() {
        if (calculations == null) {
            calculations = new ArrayList<String>();
        }
        return this.calculations;
    }

}
