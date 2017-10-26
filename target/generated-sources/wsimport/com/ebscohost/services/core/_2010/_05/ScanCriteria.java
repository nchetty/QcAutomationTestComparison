
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Database" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LimiterQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrowseIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanCriteria", propOrder = {
    "database",
    "tag",
    "term",
    "number",
    "offset",
    "limiterQuery",
    "browseIndex"
})
public class ScanCriteria {

    @XmlElement(name = "Database", required = true, nillable = true)
    protected String database;
    @XmlElement(name = "Tag", required = true, nillable = true)
    protected String tag;
    @XmlElement(name = "Term", required = true, nillable = true)
    protected String term;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Offset")
    protected int offset;
    @XmlElement(name = "LimiterQuery", nillable = true)
    protected String limiterQuery;
    @XmlElement(name = "BrowseIndex")
    protected Boolean browseIndex;

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the limiterQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiterQuery() {
        return limiterQuery;
    }

    /**
     * Sets the value of the limiterQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiterQuery(String value) {
        this.limiterQuery = value;
    }

    /**
     * Gets the value of the browseIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrowseIndex() {
        return browseIndex;
    }

    /**
     * Sets the value of the browseIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrowseIndex(Boolean value) {
        this.browseIndex = value;
    }

}
