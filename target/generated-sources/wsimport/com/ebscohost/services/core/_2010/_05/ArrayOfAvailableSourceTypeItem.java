
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAvailableSourceTypeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAvailableSourceTypeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableSourceTypeItem" type="{http://www.ebscohost.com/services/core/2010/05}AvailableSourceTypeItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAvailableSourceTypeItem", propOrder = {
    "availableSourceTypeItem"
})
public class ArrayOfAvailableSourceTypeItem {

    @XmlElement(name = "AvailableSourceTypeItem", nillable = true)
    protected List<AvailableSourceTypeItem> availableSourceTypeItem;

    /**
     * Gets the value of the availableSourceTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableSourceTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableSourceTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableSourceTypeItem }
     * 
     * 
     */
    public List<AvailableSourceTypeItem> getAvailableSourceTypeItem() {
        if (availableSourceTypeItem == null) {
            availableSourceTypeItem = new ArrayList<AvailableSourceTypeItem>();
        }
        return this.availableSourceTypeItem;
    }

}
