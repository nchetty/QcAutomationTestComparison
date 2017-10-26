
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMultiSearchItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMultiSearchItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiSearchItem" type="{http://www.ebscohost.com/services/core/2010/05}MultiSearchItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMultiSearchItem", propOrder = {
    "multiSearchItem"
})
public class ArrayOfMultiSearchItem {

    @XmlElement(name = "MultiSearchItem", nillable = true)
    protected List<MultiSearchItem> multiSearchItem;

    /**
     * Gets the value of the multiSearchItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSearchItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSearchItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiSearchItem }
     * 
     * 
     */
    public List<MultiSearchItem> getMultiSearchItem() {
        if (multiSearchItem == null) {
            multiSearchItem = new ArrayList<MultiSearchItem>();
        }
        return this.multiSearchItem;
    }

}
