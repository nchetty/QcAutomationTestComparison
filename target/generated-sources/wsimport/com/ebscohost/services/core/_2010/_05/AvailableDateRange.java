
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.SearchProgressStatus;


/**
 * <p>Java class for AvailableDateRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableDateRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchProgressStatus"/>
 *         &lt;element name="MinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableDateRange", propOrder = {
    "status",
    "minDate",
    "maxDate"
})
public class AvailableDateRange {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected SearchProgressStatus status;
    @XmlElement(name = "MinDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minDate;
    @XmlElement(name = "MaxDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxDate;

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
     * Gets the value of the minDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinDate() {
        return minDate;
    }

    /**
     * Sets the value of the minDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinDate(XMLGregorianCalendar value) {
        this.minDate = value;
    }

    /**
     * Gets the value of the maxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxDate() {
        return maxDate;
    }

    /**
     * Sets the value of the maxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxDate(XMLGregorianCalendar value) {
        this.maxDate = value;
    }

}
