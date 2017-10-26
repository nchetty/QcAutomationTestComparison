
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSourceSearchStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSourceSearchStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceSearchStatus" type="{http://www.ebscohost.com/services/core/2010/05}SourceSearchStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSourceSearchStatus", propOrder = {
    "sourceSearchStatus"
})
public class ArrayOfSourceSearchStatus {

    @XmlElement(name = "SourceSearchStatus", nillable = true)
    protected List<SourceSearchStatus> sourceSearchStatus;

    /**
     * Gets the value of the sourceSearchStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceSearchStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceSearchStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceSearchStatus }
     * 
     * 
     */
    public List<SourceSearchStatus> getSourceSearchStatus() {
        if (sourceSearchStatus == null) {
            sourceSearchStatus = new ArrayList<SourceSearchStatus>();
        }
        return this.sourceSearchStatus;
    }

}
