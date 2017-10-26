
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchProgressStatus;


/**
 * <p>Java class for SearchStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverallProgress" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchProgressStatus"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Expires" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration"/>
 *         &lt;element name="TotalHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvailableHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DedupeHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchStatus", propOrder = {
    "overallProgress",
    "created",
    "expires",
    "totalHits",
    "availableHits",
    "message",
    "dedupeHits"
})
public class SearchStatus {

    @XmlElement(name = "OverallProgress", required = true)
    @XmlSchemaType(name = "string")
    protected SearchProgressStatus overallProgress;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Expires", required = true)
    protected Duration expires;
    @XmlElement(name = "TotalHits")
    protected int totalHits;
    @XmlElement(name = "AvailableHits")
    protected int availableHits;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "DedupeHits")
    protected int dedupeHits;

    /**
     * Gets the value of the overallProgress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgressStatus }
     *     
     */
    public SearchProgressStatus getOverallProgress() {
        return overallProgress;
    }

    /**
     * Sets the value of the overallProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgressStatus }
     *     
     */
    public void setOverallProgress(SearchProgressStatus value) {
        this.overallProgress = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
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
     * Gets the value of the totalHits property.
     * 
     */
    public int getTotalHits() {
        return totalHits;
    }

    /**
     * Sets the value of the totalHits property.
     * 
     */
    public void setTotalHits(int value) {
        this.totalHits = value;
    }

    /**
     * Gets the value of the availableHits property.
     * 
     */
    public int getAvailableHits() {
        return availableHits;
    }

    /**
     * Sets the value of the availableHits property.
     * 
     */
    public void setAvailableHits(int value) {
        this.availableHits = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the dedupeHits property.
     * 
     */
    public int getDedupeHits() {
        return dedupeHits;
    }

    /**
     * Sets the value of the dedupeHits property.
     * 
     */
    public void setDedupeHits(int value) {
        this.dedupeHits = value;
    }

}
