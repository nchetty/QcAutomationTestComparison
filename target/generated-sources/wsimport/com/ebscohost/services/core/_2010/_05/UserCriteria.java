
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.ApplicationId;


/**
 * <p>Java class for UserCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationID" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}ApplicationId" minOccurs="0"/>
 *         &lt;element name="ApplicationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationContext" type="{http://www.ebscohost.com/services/core/2010/05}ApplicationContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCriteria", propOrder = {
    "customer",
    "group",
    "profile",
    "language",
    "label",
    "target",
    "sessionID",
    "userIP",
    "clientApplicationID",
    "activityID",
    "applicationID",
    "applicationSource",
    "applicationContext"
})
public class UserCriteria {

    @XmlElement(name = "Customer", required = true, nillable = true)
    protected String customer;
    @XmlElement(name = "Group", required = true, nillable = true)
    protected String group;
    @XmlElement(name = "Profile", required = true, nillable = true)
    protected String profile;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "Target", nillable = true)
    protected String target;
    @XmlElement(name = "SessionID", nillable = true)
    protected String sessionID;
    @XmlElement(name = "UserIP", nillable = true)
    protected String userIP;
    @XmlElement(name = "ClientApplicationID", nillable = true)
    protected String clientApplicationID;
    @XmlElement(name = "ActivityID", nillable = true)
    protected String activityID;
    @XmlElement(name = "ApplicationID")
    @XmlSchemaType(name = "string")
    protected ApplicationId applicationID;
    @XmlElement(name = "ApplicationSource", nillable = true)
    protected String applicationSource;
    @XmlElement(name = "ApplicationContext", nillable = true)
    protected ApplicationContext applicationContext;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the userIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIP() {
        return userIP;
    }

    /**
     * Sets the value of the userIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIP(String value) {
        this.userIP = value;
    }

    /**
     * Gets the value of the clientApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationID() {
        return clientApplicationID;
    }

    /**
     * Sets the value of the clientApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationID(String value) {
        this.clientApplicationID = value;
    }

    /**
     * Gets the value of the activityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityID(String value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the applicationID property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationId }
     *     
     */
    public ApplicationId getApplicationID() {
        return applicationID;
    }

    /**
     * Sets the value of the applicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationId }
     *     
     */
    public void setApplicationID(ApplicationId value) {
        this.applicationID = value;
    }

    /**
     * Gets the value of the applicationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationSource() {
        return applicationSource;
    }

    /**
     * Sets the value of the applicationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationSource(String value) {
        this.applicationSource = value;
    }

    /**
     * Gets the value of the applicationContext property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContext }
     *     
     */
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the value of the applicationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContext }
     *     
     */
    public void setApplicationContext(ApplicationContext value) {
        this.applicationContext = value;
    }

}
