
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClusterCategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SelectionSequenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterItem", propOrder = {
    "clusterCategoryName",
    "term",
    "selectionSequenceID"
})
public class ClusterItem {

    @XmlElement(name = "ClusterCategoryName", required = true, nillable = true)
    protected String clusterCategoryName;
    @XmlElement(name = "Term", required = true, nillable = true)
    protected String term;
    @XmlElement(name = "SelectionSequenceID")
    protected int selectionSequenceID;

    /**
     * Gets the value of the clusterCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterCategoryName() {
        return clusterCategoryName;
    }

    /**
     * Sets the value of the clusterCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterCategoryName(String value) {
        this.clusterCategoryName = value;
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
     * Gets the value of the selectionSequenceID property.
     * 
     */
    public int getSelectionSequenceID() {
        return selectionSequenceID;
    }

    /**
     * Sets the value of the selectionSequenceID property.
     * 
     */
    public void setSelectionSequenceID(int value) {
        this.selectionSequenceID = value;
    }

}
