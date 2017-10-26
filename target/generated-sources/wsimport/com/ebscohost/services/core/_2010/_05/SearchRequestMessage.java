
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://www.ebscohost.com/services/core/2010/05}UserCriteria"/>
 *         &lt;element name="Criteria" type="{http://www.ebscohost.com/services/core/2010/05}SearchCriteria"/>
 *         &lt;element name="Calculations" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SearchCalculations" minOccurs="0"/>
 *         &lt;element name="Subscriptions" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}SubscriptionFlags" minOccurs="0"/>
 *         &lt;element name="InitialRequest" type="{http://www.ebscohost.com/services/core/2010/05}InitialRecordRequest" minOccurs="0"/>
 *         &lt;element name="History" type="{http://www.ebscohost.com/services/core/2010/05}SearchHistory" minOccurs="0"/>
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
@XmlType(name = "SearchRequestMessage", propOrder = {
    "user",
    "criteria",
    "calculations",
    "subscriptions",
    "initialRequest",
    "history",
    "diagnostics"
})
public class SearchRequestMessage {

    @XmlElement(name = "User", required = true, nillable = true)
    protected UserCriteria user;
    @XmlElement(name = "Criteria", required = true, nillable = true)
    protected SearchCriteria criteria;
    @XmlList
    @XmlElement(name = "Calculations")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> calculations;
    @XmlList
    @XmlElement(name = "Subscriptions")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> subscriptions;
    @XmlElement(name = "InitialRequest", nillable = true)
    protected InitialRecordRequest initialRequest;
    @XmlElement(name = "History", nillable = true)
    protected SearchHistory history;
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

    /**
     * Gets the value of the subscriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new ArrayList<String>();
        }
        return this.subscriptions;
    }

    /**
     * Gets the value of the initialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InitialRecordRequest }
     *     
     */
    public InitialRecordRequest getInitialRequest() {
        return initialRequest;
    }

    /**
     * Sets the value of the initialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialRecordRequest }
     *     
     */
    public void setInitialRequest(InitialRecordRequest value) {
        this.initialRequest = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link SearchHistory }
     *     
     */
    public SearchHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHistory }
     *     
     */
    public void setHistory(SearchHistory value) {
        this.history = value;
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
