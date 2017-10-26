
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
 * <p>Java class for SelectedCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Databases" type="{http://www.ebscohost.com/services/core/2010/05}DatabaseCriteria"/>
 *         &lt;element name="Expressions" type="{http://www.ebscohost.com/services/core/2010/05}ExpressionCriteria" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.ebscohost.com/services/core/2010/05}SelectedSortCriteria" minOccurs="0"/>
 *         &lt;element name="Limiters" type="{http://www.ebscohost.com/services/core/2010/05}LimiterCriteria" minOccurs="0"/>
 *         &lt;element name="Expanders" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}ExpanderCriteria" minOccurs="0"/>
 *         &lt;element name="SourceTypes" type="{http://www.ebscohost.com/services/core/2010/05}SelectedSourceTypeCriteria" minOccurs="0"/>
 *         &lt;element name="Clusters" type="{http://www.ebscohost.com/services/core/2010/05}ClusterCriteria" minOccurs="0"/>
 *         &lt;element name="SearchTheme" type="{http://www.ebscohost.com/services/core/2010/05}SearchThemeCriteria" minOccurs="0"/>
 *         &lt;element name="ExternalOptions" type="{http://www.ebscohost.com/services/core/2010/05}ExternalSearchOptions" minOccurs="0"/>
 *         &lt;element name="ContextInfo" type="{http://www.ebscohost.com/services/core/2010/05}SearchContext" minOccurs="0"/>
 *         &lt;element name="ConceptInfo" type="{http://www.ebscohost.com/services/core/2010/05}SearchConcept" minOccurs="0"/>
 *         &lt;element name="AutoCorrect" type="{http://www.ebscohost.com/services/core/2010/05}AutoCorrectCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCriteria", propOrder = {
    "databases",
    "expressions",
    "sort",
    "limiters",
    "expanders",
    "sourceTypes",
    "clusters",
    "searchTheme",
    "externalOptions",
    "contextInfo",
    "conceptInfo",
    "autoCorrect"
})
public class SelectedCriteria {

    @XmlElement(name = "Databases", required = true, nillable = true)
    protected DatabaseCriteria databases;
    @XmlElement(name = "Expressions", nillable = true)
    protected ExpressionCriteria expressions;
    @XmlElement(name = "Sort", nillable = true)
    protected SelectedSortCriteria sort;
    @XmlElement(name = "Limiters", nillable = true)
    protected LimiterCriteria limiters;
    @XmlList
    @XmlElement(name = "Expanders")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> expanders;
    @XmlElement(name = "SourceTypes", nillable = true)
    protected SelectedSourceTypeCriteria sourceTypes;
    @XmlElement(name = "Clusters", nillable = true)
    protected ClusterCriteria clusters;
    @XmlElement(name = "SearchTheme", nillable = true)
    protected SearchThemeCriteria searchTheme;
    @XmlElement(name = "ExternalOptions", nillable = true)
    protected ExternalSearchOptions externalOptions;
    @XmlElement(name = "ContextInfo", nillable = true)
    protected SearchContext contextInfo;
    @XmlElement(name = "ConceptInfo", nillable = true)
    protected SearchConcept conceptInfo;
    @XmlElement(name = "AutoCorrect", nillable = true)
    protected AutoCorrectCriteria autoCorrect;

    /**
     * Gets the value of the databases property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseCriteria }
     *     
     */
    public DatabaseCriteria getDatabases() {
        return databases;
    }

    /**
     * Sets the value of the databases property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseCriteria }
     *     
     */
    public void setDatabases(DatabaseCriteria value) {
        this.databases = value;
    }

    /**
     * Gets the value of the expressions property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionCriteria }
     *     
     */
    public ExpressionCriteria getExpressions() {
        return expressions;
    }

    /**
     * Sets the value of the expressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionCriteria }
     *     
     */
    public void setExpressions(ExpressionCriteria value) {
        this.expressions = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedSortCriteria }
     *     
     */
    public SelectedSortCriteria getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedSortCriteria }
     *     
     */
    public void setSort(SelectedSortCriteria value) {
        this.sort = value;
    }

    /**
     * Gets the value of the limiters property.
     * 
     * @return
     *     possible object is
     *     {@link LimiterCriteria }
     *     
     */
    public LimiterCriteria getLimiters() {
        return limiters;
    }

    /**
     * Sets the value of the limiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimiterCriteria }
     *     
     */
    public void setLimiters(LimiterCriteria value) {
        this.limiters = value;
    }

    /**
     * Gets the value of the expanders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expanders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpanders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExpanders() {
        if (expanders == null) {
            expanders = new ArrayList<String>();
        }
        return this.expanders;
    }

    /**
     * Gets the value of the sourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedSourceTypeCriteria }
     *     
     */
    public SelectedSourceTypeCriteria getSourceTypes() {
        return sourceTypes;
    }

    /**
     * Sets the value of the sourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedSourceTypeCriteria }
     *     
     */
    public void setSourceTypes(SelectedSourceTypeCriteria value) {
        this.sourceTypes = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterCriteria }
     *     
     */
    public ClusterCriteria getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterCriteria }
     *     
     */
    public void setClusters(ClusterCriteria value) {
        this.clusters = value;
    }

    /**
     * Gets the value of the searchTheme property.
     * 
     * @return
     *     possible object is
     *     {@link SearchThemeCriteria }
     *     
     */
    public SearchThemeCriteria getSearchTheme() {
        return searchTheme;
    }

    /**
     * Sets the value of the searchTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchThemeCriteria }
     *     
     */
    public void setSearchTheme(SearchThemeCriteria value) {
        this.searchTheme = value;
    }

    /**
     * Gets the value of the externalOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalSearchOptions }
     *     
     */
    public ExternalSearchOptions getExternalOptions() {
        return externalOptions;
    }

    /**
     * Sets the value of the externalOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalSearchOptions }
     *     
     */
    public void setExternalOptions(ExternalSearchOptions value) {
        this.externalOptions = value;
    }

    /**
     * Gets the value of the contextInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchContext }
     *     
     */
    public SearchContext getContextInfo() {
        return contextInfo;
    }

    /**
     * Sets the value of the contextInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchContext }
     *     
     */
    public void setContextInfo(SearchContext value) {
        this.contextInfo = value;
    }

    /**
     * Gets the value of the conceptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchConcept }
     *     
     */
    public SearchConcept getConceptInfo() {
        return conceptInfo;
    }

    /**
     * Sets the value of the conceptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchConcept }
     *     
     */
    public void setConceptInfo(SearchConcept value) {
        this.conceptInfo = value;
    }

    /**
     * Gets the value of the autoCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link AutoCorrectCriteria }
     *     
     */
    public AutoCorrectCriteria getAutoCorrect() {
        return autoCorrect;
    }

    /**
     * Sets the value of the autoCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCorrectCriteria }
     *     
     */
    public void setAutoCorrect(AutoCorrectCriteria value) {
        this.autoCorrect = value;
    }

}
