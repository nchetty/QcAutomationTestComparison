
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSetStatusMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSetStatusMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.ebscohost.com/services/core/2010/05}SearchStatus"/>
 *         &lt;element name="Sources" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfSourceSearchStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSetStatusMessage", propOrder = {
    "status",
    "sources"
})
public class ResultSetStatusMessage {

    @XmlElement(name = "Status", required = true, nillable = true)
    protected SearchStatus status;
    @XmlElement(name = "Sources", required = true, nillable = true)
    protected ArrayOfSourceSearchStatus sources;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStatus }
     *     
     */
    public SearchStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStatus }
     *     
     */
    public void setStatus(SearchStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceSearchStatus }
     *     
     */
    public ArrayOfSourceSearchStatus getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceSearchStatus }
     *     
     */
    public void setSources(ArrayOfSourceSearchStatus value) {
        this.sources = value;
    }

}
