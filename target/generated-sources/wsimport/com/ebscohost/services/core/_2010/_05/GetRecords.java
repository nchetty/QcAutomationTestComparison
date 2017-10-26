
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.RecordFormat;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="format" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFormat" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFlags" minOccurs="0"/>
 *         &lt;element name="diagnosticCriteria" type="{http://www.ebscohost.com/services/core/2010/05}Diagnostics" minOccurs="0"/>
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
    "id",
    "positions",
    "format",
    "flags",
    "diagnosticCriteria"
})
@XmlRootElement(name = "GetRecords")
public class GetRecords {

    @XmlElement(nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected ArrayOfint positions;
    @XmlSchemaType(name = "string")
    protected RecordFormat format;
    @XmlList
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> flags;
    @XmlElement(nillable = true)
    protected Diagnostics diagnosticCriteria;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setPositions(ArrayOfint value) {
        this.positions = value;
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
     * Gets the value of the diagnosticCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link Diagnostics }
     *     
     */
    public Diagnostics getDiagnosticCriteria() {
        return diagnosticCriteria;
    }

    /**
     * Sets the value of the diagnosticCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnostics }
     *     
     */
    public void setDiagnosticCriteria(Diagnostics value) {
        this.diagnosticCriteria = value;
    }

}
