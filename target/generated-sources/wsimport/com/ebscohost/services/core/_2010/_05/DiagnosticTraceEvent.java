
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.DiagnosticLevel;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.DiagnosticSource;


/**
 * <p>Java class for DiagnosticTraceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTraceEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Thread" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Source" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}DiagnosticSource"/>
 *         &lt;element name="Level" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}DiagnosticLevel"/>
 *         &lt;element name="DurationInMs" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDetails" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfDiagnosticTraceOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTraceEvent", propOrder = {
    "eventId",
    "time",
    "thread",
    "source",
    "level",
    "durationInMs",
    "message",
    "eventDetails"
})
public class DiagnosticTraceEvent {

    @XmlElement(name = "EventId")
    protected int eventId;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected String time;
    @XmlElement(name = "Thread")
    protected int thread;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosticSource source;
    @XmlElement(name = "Level", required = true)
    @XmlSchemaType(name = "string")
    protected DiagnosticLevel level;
    @XmlElement(name = "DurationInMs")
    protected long durationInMs;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "EventDetails", nillable = true)
    protected ArrayOfDiagnosticTraceOperation eventDetails;

    /**
     * Gets the value of the eventId property.
     * 
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(int value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the thread property.
     * 
     */
    public int getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     */
    public void setThread(int value) {
        this.thread = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticSource }
     *     
     */
    public DiagnosticSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticSource }
     *     
     */
    public void setSource(DiagnosticSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticLevel }
     *     
     */
    public DiagnosticLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticLevel }
     *     
     */
    public void setLevel(DiagnosticLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the durationInMs property.
     * 
     */
    public long getDurationInMs() {
        return durationInMs;
    }

    /**
     * Sets the value of the durationInMs property.
     * 
     */
    public void setDurationInMs(long value) {
        this.durationInMs = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosticTraceOperation }
     *     
     */
    public ArrayOfDiagnosticTraceOperation getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosticTraceOperation }
     *     
     */
    public void setEventDetails(ArrayOfDiagnosticTraceOperation value) {
        this.eventDetails = value;
    }

}
