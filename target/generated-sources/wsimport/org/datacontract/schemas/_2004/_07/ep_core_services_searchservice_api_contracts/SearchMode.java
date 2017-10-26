
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="And"/>
 *     &lt;enumeration value="Or"/>
 *     &lt;enumeration value="Relevancy"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchMode", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum SearchMode {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or"),
    @XmlEnumValue("Relevancy")
    RELEVANCY("Relevancy"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    SearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchMode fromValue(String v) {
        for (SearchMode c: SearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
