
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRecordRetrievalCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRecordRetrievalCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetrievalRequests" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfMultiRecordRetrievalItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRecordRetrievalCriteria", propOrder = {
    "retrievalRequests"
})
public class MultiRecordRetrievalCriteria {

    @XmlElement(name = "RetrievalRequests", required = true, nillable = true)
    protected ArrayOfMultiRecordRetrievalItem retrievalRequests;

    /**
     * Gets the value of the retrievalRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiRecordRetrievalItem }
     *     
     */
    public ArrayOfMultiRecordRetrievalItem getRetrievalRequests() {
        return retrievalRequests;
    }

    /**
     * Sets the value of the retrievalRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiRecordRetrievalItem }
     *     
     */
    public void setRetrievalRequests(ArrayOfMultiRecordRetrievalItem value) {
        this.retrievalRequests = value;
    }

}
