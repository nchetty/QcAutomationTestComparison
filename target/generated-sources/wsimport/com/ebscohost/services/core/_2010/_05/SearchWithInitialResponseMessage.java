
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SearchWithInitialResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchWithInitialResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultSetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Records">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Diagnostics" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchWithInitialResponseMessage", propOrder = {
    "resultSetID",
    "records",
    "diagnostics"
})
public class SearchWithInitialResponseMessage {

    @XmlElement(name = "ResultSetID", required = true, nillable = true)
    protected String resultSetID;
    @XmlElement(name = "Records", required = true, nillable = true)
    protected SearchWithInitialResponseMessage.Records records;
    @XmlElement(name = "Diagnostics", nillable = true)
    protected DiagnosticResponse diagnostics;

    /**
     * Gets the value of the resultSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetID() {
        return resultSetID;
    }

    /**
     * Sets the value of the resultSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetID(String value) {
        this.resultSetID = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link SearchWithInitialResponseMessage.Records }
     *     
     */
    public SearchWithInitialResponseMessage.Records getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchWithInitialResponseMessage.Records }
     *     
     */
    public void setRecords(SearchWithInitialResponseMessage.Records value) {
        this.records = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResponse }
     *     
     */
    public DiagnosticResponse getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResponse }
     *     
     */
    public void setDiagnostics(DiagnosticResponse value) {
        this.diagnostics = value;
    }


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
     *         &lt;any processContents='lax' minOccurs="0"/>
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
        "any"
    })
    public static class Records {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
