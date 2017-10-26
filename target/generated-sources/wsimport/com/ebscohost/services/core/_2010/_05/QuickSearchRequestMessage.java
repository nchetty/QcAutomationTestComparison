
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickSearchRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickSearchRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://www.ebscohost.com/services/core/2010/05}UserCriteria"/>
 *         &lt;element name="Queries" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfQuickSearchQuery"/>
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
@XmlType(name = "QuickSearchRequestMessage", propOrder = {
    "user",
    "queries",
    "history",
    "diagnostics"
})
public class QuickSearchRequestMessage {

    @XmlElement(name = "User", required = true, nillable = true)
    protected UserCriteria user;
    @XmlElement(name = "Queries", required = true, nillable = true)
    protected ArrayOfQuickSearchQuery queries;
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
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuickSearchQuery }
     *     
     */
    public ArrayOfQuickSearchQuery getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuickSearchQuery }
     *     
     */
    public void setQueries(ArrayOfQuickSearchQuery value) {
        this.queries = value;
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
