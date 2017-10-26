
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSearchCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiSearchCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="ContentVertical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiSearchCriteriaType", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum MultiSearchCriteriaType {

    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("ContentVertical")
    CONTENT_VERTICAL("ContentVertical");
    private final String value;

    MultiSearchCriteriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiSearchCriteriaType fromValue(String v) {
        for (MultiSearchCriteriaType c: MultiSearchCriteriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
