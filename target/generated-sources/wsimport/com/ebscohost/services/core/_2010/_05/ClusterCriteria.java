
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedClusters" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfClusterItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterCriteria", propOrder = {
    "selectedClusters"
})
public class ClusterCriteria {

    @XmlElement(name = "SelectedClusters", nillable = true)
    protected ArrayOfClusterItem selectedClusters;

    /**
     * Gets the value of the selectedClusters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClusterItem }
     *     
     */
    public ArrayOfClusterItem getSelectedClusters() {
        return selectedClusters;
    }

    /**
     * Sets the value of the selectedClusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClusterItem }
     *     
     */
    public void setSelectedClusters(ArrayOfClusterItem value) {
        this.selectedClusters = value;
    }

}
