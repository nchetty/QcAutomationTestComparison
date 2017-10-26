
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchProgressStatus;


/**
 * <p>Java class for AvailableSourceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableSourceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchProgressStatus"/>
 *         &lt;element name="Items" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfAvailableSourceTypeItem" minOccurs="0"/>
 *         &lt;element name="NoHitsForAllResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableSourceTypes", propOrder = {
    "status",
    "items",
    "noHitsForAllResults"
})
public class AvailableSourceTypes {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected SearchProgressStatus status;
    @XmlElement(name = "Items", nillable = true)
    protected ArrayOfAvailableSourceTypeItem items;
    @XmlElement(name = "NoHitsForAllResults")
    protected Boolean noHitsForAllResults;

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
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableSourceTypeItem }
     *     
     */
    public ArrayOfAvailableSourceTypeItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableSourceTypeItem }
     *     
     */
    public void setItems(ArrayOfAvailableSourceTypeItem value) {
        this.items = value;
    }

    /**
     * Gets the value of the noHitsForAllResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoHitsForAllResults() {
        return noHitsForAllResults;
    }

    /**
     * Sets the value of the noHitsForAllResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoHitsForAllResults(Boolean value) {
        this.noHitsForAllResults = value;
    }

}
