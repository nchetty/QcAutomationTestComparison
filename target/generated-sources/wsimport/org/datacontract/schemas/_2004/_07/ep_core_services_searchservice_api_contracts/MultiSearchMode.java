
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSearchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiSearchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Smart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiSearchMode", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum MultiSearchMode {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Smart")
    SMART("Smart");
    private final String value;

    MultiSearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiSearchMode fromValue(String v) {
        for (MultiSearchMode c: MultiSearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
