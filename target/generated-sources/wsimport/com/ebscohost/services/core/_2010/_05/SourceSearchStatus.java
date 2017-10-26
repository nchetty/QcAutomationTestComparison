
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchProgressStatus;


/**
 * <p>Java class for SourceSearchStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceSearchStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Progress" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchProgressStatus"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvailableHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsSubset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceSearchStatus", propOrder = {
    "name",
    "progress",
    "message",
    "totalHits",
    "availableHits",
    "duration",
    "query",
    "isSubset",
    "parentName"
})
public class SourceSearchStatus {

    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Progress", required = true)
    @XmlSchemaType(name = "string")
    protected SearchProgressStatus progress;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "TotalHits")
    protected int totalHits;
    @XmlElement(name = "AvailableHits")
    protected int availableHits;
    @XmlElement(name = "Duration", required = true)
    protected Duration duration;
    @XmlElement(name = "Query", required = true, nillable = true)
    protected String query;
    @XmlElement(name = "IsSubset")
    protected Boolean isSubset;
    @XmlElement(name = "ParentName", nillable = true)
    protected String parentName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgressStatus }
     *     
     */
    public SearchProgressStatus getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgressStatus }
     *     
     */
    public void setProgress(SearchProgressStatus value) {
        this.progress = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the isSubset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubset() {
        return isSubset;
    }

    /**
     * Sets the value of the isSubset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubset(Boolean value) {
        this.isSubset = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

}
