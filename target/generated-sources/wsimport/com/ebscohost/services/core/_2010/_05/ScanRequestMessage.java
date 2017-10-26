
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.RecordFormat;


/**
 * <p>Java class for ScanRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://www.ebscohost.com/services/core/2010/05}UserCriteria"/>
 *         &lt;element name="Criteria" type="{http://www.ebscohost.com/services/core/2010/05}ScanCriteria"/>
 *         &lt;element name="Format" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFormat"/>
 *         &lt;element name="Flags" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}RecordFlags"/>
 *         &lt;element name="Diagnostics" type="{http://www.ebscohost.com/services/core/2010/05}Diagnostics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanRequestMessage", propOrder = {
    "user",
    "criteria",
    "format",
    "flags",
    "diagnostics"
})
public class ScanRequestMessage {

    @XmlElement(name = "User", required = true, nillable = true)
    protected UserCriteria user;
    @XmlElement(name = "Criteria", required = true, nillable = true)
    protected ScanCriteria criteria;
    @XmlElement(name = "Format", required = true)
    @XmlSchemaType(name = "string")
    protected RecordFormat format;
    @XmlList
    @XmlElement(name = "Flags", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> flags;
    @XmlElement(name = "Diagnostics", nillable = true)
    protected Diagnostics diagnostics;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserCriteria }
     *     
     */
    public UserCriteria getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCriteria }
     *     
     */
    public void setUser(UserCriteria value) {
        this.user = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ScanCriteria }
     *     
     */
    public ScanCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanCriteria }
     *     
     */
    public void setCriteria(ScanCriteria value) {
        this.criteria = value;
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
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link Diagnostics }
     *     
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnostics }
     *     
     */
    public void setDiagnostics(Diagnostics value) {
        this.diagnostics = value;
    }

}
