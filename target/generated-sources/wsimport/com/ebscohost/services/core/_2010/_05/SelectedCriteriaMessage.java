
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedCriteriaMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedCriteriaMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://www.ebscohost.com/services/core/2010/05}UserCriteria"/>
 *         &lt;element name="Criteria" type="{http://www.ebscohost.com/services/core/2010/05}SelectedCriteria"/>
 *         &lt;element name="ContainsSearchHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Diagnostics" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCriteriaMessage", propOrder = {
    "user",
    "criteria",
    "containsSearchHistory",
    "diagnostics"
})
public class SelectedCriteriaMessage {

    @XmlElement(name = "User", required = true, nillable = true)
    protected UserCriteria user;
    @XmlElement(name = "Criteria", required = true, nillable = true)
    protected SelectedCriteria criteria;
    @XmlElement(name = "ContainsSearchHistory")
    protected Boolean containsSearchHistory;
    @XmlElement(name = "Diagnostics", nillable = true)
    protected DiagnosticResponse diagnostics;

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
     *     {@link SelectedCriteria }
     *     
     */
    public SelectedCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedCriteria }
     *     
     */
    public void setCriteria(SelectedCriteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the containsSearchHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsSearchHistory() {
        return containsSearchHistory;
    }

    /**
     * Sets the value of the containsSearchHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsSearchHistory(Boolean value) {
        this.containsSearchHistory = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResponse }
     *     
     */
    public DiagnosticResponse getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResponse }
     *     
     */
    public void setDiagnostics(DiagnosticResponse value) {
        this.diagnostics = value;
    }

}
