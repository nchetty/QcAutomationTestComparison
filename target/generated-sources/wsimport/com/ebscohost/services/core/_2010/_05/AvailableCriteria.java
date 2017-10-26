
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clusters" type="{http://www.ebscohost.com/services/core/2010/05}AvailableClusters" minOccurs="0"/>
 *         &lt;element name="SourceTypes" type="{http://www.ebscohost.com/services/core/2010/05}AvailableSourceTypes" minOccurs="0"/>
 *         &lt;element name="SortOptions" type="{http://www.ebscohost.com/services/core/2010/05}AvailableSortOptions" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://www.ebscohost.com/services/core/2010/05}AvailableDateRange" minOccurs="0"/>
 *         &lt;element name="Disciplines" type="{http://www.ebscohost.com/services/core/2010/05}AvailableDisciplines" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableCriteria", propOrder = {
    "clusters",
    "sourceTypes",
    "sortOptions",
    "dateRange",
    "disciplines"
})
public class AvailableCriteria {

    @XmlElement(name = "Clusters", nillable = true)
    protected AvailableClusters clusters;
    @XmlElement(name = "SourceTypes", nillable = true)
    protected AvailableSourceTypes sourceTypes;
    @XmlElement(name = "SortOptions", nillable = true)
    protected AvailableSortOptions sortOptions;
    @XmlElement(name = "DateRange", nillable = true)
    protected AvailableDateRange dateRange;
    @XmlElement(name = "Disciplines", nillable = true)
    protected AvailableDisciplines disciplines;

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableClusters }
     *     
     */
    public AvailableClusters getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableClusters }
     *     
     */
    public void setClusters(AvailableClusters value) {
        this.clusters = value;
    }

    /**
     * Gets the value of the sourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSourceTypes }
     *     
     */
    public AvailableSourceTypes getSourceTypes() {
        return sourceTypes;
    }

    /**
     * Sets the value of the sourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSourceTypes }
     *     
     */
    public void setSourceTypes(AvailableSourceTypes value) {
        this.sourceTypes = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSortOptions }
     *     
     */
    public AvailableSortOptions getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSortOptions }
     *     
     */
    public void setSortOptions(AvailableSortOptions value) {
        this.sortOptions = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableDateRange }
     *     
     */
    public AvailableDateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableDateRange }
     *     
     */
    public void setDateRange(AvailableDateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the disciplines property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableDisciplines }
     *     
     */
    public AvailableDisciplines getDisciplines() {
        return disciplines;
    }

    /**
     * Sets the value of the disciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableDisciplines }
     *     
     */
    public void setDisciplines(AvailableDisciplines value) {
        this.disciplines = value;
    }

}
