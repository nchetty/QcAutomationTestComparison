
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Clusters" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfAvailableClusterItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterCategory", propOrder = {
    "id",
    "clusters"
})
public class ClusterCategory {

    @XmlElement(name = "ID", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Clusters", required = true, nillable = true)
    protected ArrayOfAvailableClusterItem clusters;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableClusterItem }
     *     
     */
    public ArrayOfAvailableClusterItem getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableClusterItem }
     *     
     */
    public void setClusters(ArrayOfAvailableClusterItem value) {
        this.clusters = value;
    }

}
