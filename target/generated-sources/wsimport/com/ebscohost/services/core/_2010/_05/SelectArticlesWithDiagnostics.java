
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://www.ebscohost.com/services/core/2010/05}ArticleRequestMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "SelectArticlesWithDiagnostics")
public class SelectArticlesWithDiagnostics {

    @XmlElement(nillable = true)
    protected ArticleRequestMessage request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleRequestMessage }
     *     
     */
    public ArticleRequestMessage getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleRequestMessage }
     *     
     */
    public void setRequest(ArticleRequestMessage value) {
        this.request = value;
    }

}
