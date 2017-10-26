
package com.ebscohost.services.core._2010._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.MultiSearchMode;


/**
 * <p>Java class for MultiSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data}MultiSearchMode"/>
 *         &lt;element name="Searches" type="{http://www.ebscohost.com/services/core/2010/05}ArrayOfMultiSearchItem"/>
 *         &lt;element name="VerticalCriteria" type="{http://www.ebscohost.com/services/core/2010/05}ContentVerticalCriteria" minOccurs="0"/>
 *         &lt;element name="VerticalIntegration" type="{http://www.ebscohost.com/services/core/2010/05}VerticalIntegrationCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSearchCriteria", propOrder = {
    "mode",
    "searches",
    "verticalCriteria",
    "verticalIntegration"
})
public class MultiSearchCriteria {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected MultiSearchMode mode;
    @XmlElement(name = "Searches", required = true, nillable = true)
    protected ArrayOfMultiSearchItem searches;
    @XmlElement(name = "VerticalCriteria", nillable = true)
    protected ContentVerticalCriteria verticalCriteria;
    @XmlElement(name = "VerticalIntegration", nillable = true)
    protected VerticalIntegrationCriteria verticalIntegration;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSearchMode }
     *     
     */
    public MultiSearchMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSearchMode }
     *     
     */
    public void setMode(MultiSearchMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the searches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiSearchItem }
     *     
     */
    public ArrayOfMultiSearchItem getSearches() {
        return searches;
    }

    /**
     * Sets the value of the searches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiSearchItem }
     *     
     */
    public void setSearches(ArrayOfMultiSearchItem value) {
        this.searches = value;
    }

    /**
     * Gets the value of the verticalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ContentVerticalCriteria }
     *     
     */
    public ContentVerticalCriteria getVerticalCriteria() {
        return verticalCriteria;
    }

    /**
     * Sets the value of the verticalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentVerticalCriteria }
     *     
     */
    public void setVerticalCriteria(ContentVerticalCriteria value) {
        this.verticalCriteria = value;
    }

    /**
     * Gets the value of the verticalIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalIntegrationCriteria }
     *     
     */
    public VerticalIntegrationCriteria getVerticalIntegration() {
        return verticalIntegration;
    }

    /**
     * Sets the value of the verticalIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalIntegrationCriteria }
     *     
     */
    public void setVerticalIntegration(VerticalIntegrationCriteria value) {
        this.verticalIntegration = value;
    }

}
