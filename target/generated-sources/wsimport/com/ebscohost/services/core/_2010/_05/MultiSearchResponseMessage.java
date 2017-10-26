
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for MultiSearchResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSearchResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiResultSetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Result" type="{http://www.ebscohost.com/services/core/2010/05}MultiSearchResultCriteria"/>
 *         &lt;element name="Expires" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration"/>
 *         &lt;element name="Diagnostics" type="{http://www.ebscohost.com/services/core/2010/05}DiagnosticResponse" minOccurs="0"/>
 *         &lt;element name="ResultSetRecords" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfMultiResultSetRecordItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSearchResponseMessage", propOrder = {
    "multiResultSetID",
    "result",
    "expires",
    "diagnostics",
    "resultSetRecords"
})
public class MultiSearchResponseMessage {

    @XmlElement(name = "MultiResultSetID", required = true, nillable = true)
    protected String multiResultSetID;
    @XmlElement(name = "Result", required = true, nillable = true)
    protected MultiSearchResultCriteria result;
    @XmlElement(name = "Expires", required = true)
    protected Duration expires;
    @XmlElement(name = "Diagnostics", nillable = true)
    protected DiagnosticResponse diagnostics;
    @XmlElement(name = "ResultSetRecords", required = true, nillable = true)
    protected ArrayOfMultiResultSetRecordItem resultSetRecords;

    /**
     * Gets the value of the multiResultSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiResultSetID() {
        return multiResultSetID;
    }

    /**
     * Sets the value of the multiResultSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiResultSetID(String value) {
        this.multiResultSetID = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSearchResultCriteria }
     *     
     */
    public MultiSearchResultCriteria getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSearchResultCriteria }
     *     
     */
    public void setResult(MultiSearchResultCriteria value) {
        this.result = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpires(Duration value) {
        this.expires = value;
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
     * Gets the value of the resultSetRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiResultSetRecordItem }
     *     
     */
    public ArrayOfMultiResultSetRecordItem getResultSetRecords() {
        return resultSetRecords;
    }

    /**
     * Sets the value of the resultSetRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiResultSetRecordItem }
     *     
     */
    public void setResultSetRecords(ArrayOfMultiResultSetRecordItem value) {
        this.resultSetRecords = value;
    }

}
