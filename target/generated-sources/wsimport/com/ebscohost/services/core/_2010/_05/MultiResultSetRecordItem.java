
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.ContentVerticalType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.MultiSearchCriteriaType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.RecordFormat;
import org.w3c.dom.Element;


/**
 * <p>Java class for MultiResultSetRecordItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiResultSetRecordItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}MultiSearchCriteriaType"/>
 *         &lt;element name="CVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerticalType" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}ContentVerticalType"/>
 *         &lt;element name="Format" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFormat"/>
 *         &lt;element name="Flags" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFlags"/>
 *         &lt;element name="TotalHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DedupeHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Records">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiResultSetRecordItem", propOrder = {
    "id",
    "label",
    "type",
    "cvid",
    "verticalType",
    "format",
    "flags",
    "totalHits",
    "dedupeHits",
    "records"
})
public class MultiResultSetRecordItem {

    @XmlElement(name = "ID", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Label", required = true, nillable = true)
    protected String label;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected MultiSearchCriteriaType type;
    @XmlElement(name = "CVID", required = true, nillable = true)
    protected String cvid;
    @XmlElement(name = "VerticalType", required = true)
    @XmlSchemaType(name = "string")
    protected ContentVerticalType verticalType;
    @XmlElement(name = "Format", required = true)
    @XmlSchemaType(name = "string")
    protected RecordFormat format;
    @XmlList
    @XmlElement(name = "Flags", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> flags;
    @XmlElement(name = "TotalHits")
    protected int totalHits;
    @XmlElement(name = "DedupeHits")
    protected int dedupeHits;
    @XmlElement(name = "Records", required = true, nillable = true)
    protected MultiResultSetRecordItem.Records records;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
     * Gets the value of the cvid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVID() {
        return cvid;
    }

    /**
     * Sets the value of the cvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVID(String value) {
        this.cvid = value;
    }

    /**
     * Gets the value of the verticalType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentVerticalType }
     *     
     */
    public ContentVerticalType getVerticalType() {
        return verticalType;
    }

    /**
     * Sets the value of the verticalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentVerticalType }
     *     
     */
    public void setVerticalType(ContentVerticalType value) {
        this.verticalType = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link RecordFormat }
     *     
     */
    public RecordFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordFormat }
     *     
     */
    public void setFormat(RecordFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlags() {
        if (flags == null) {
            flags = new ArrayList<String>();
        }
        return this.flags;
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

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link MultiResultSetRecordItem.Records }
     *     
     */
    public MultiResultSetRecordItem.Records getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiResultSetRecordItem.Records }
     *     
     */
    public void setRecords(MultiResultSetRecordItem.Records value) {
        this.records = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Records {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
