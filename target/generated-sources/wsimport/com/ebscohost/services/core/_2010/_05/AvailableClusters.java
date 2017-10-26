
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchProgressStatus;


/**
 * <p>Java class for AvailableClusters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableClusters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchProgressStatus"/>
 *         &lt;element name="Categories" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfClusterCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableClusters", propOrder = {
    "status",
    "categories"
})
public class AvailableClusters {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected SearchProgressStatus status;
    @XmlElement(name = "Categories", nillable = true)
    protected ArrayOfClusterCategory categories;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgressStatus }
     *     
     */
    public SearchProgressStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgressStatus }
     *     
     */
    public void setStatus(SearchProgressStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClusterCategory }
     *     
     */
    public ArrayOfClusterCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClusterCategory }
     *     
     */
    public void setCategories(ArrayOfClusterCategory value) {
        this.categories = value;
    }

}
