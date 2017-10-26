
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchConceptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchConceptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Literal"/>
 *     &lt;enumeration value="UnifiedSubjectBrowse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchConceptType", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum SearchConceptType {

    @XmlEnumValue("Literal")
    LITERAL("Literal"),
    @XmlEnumValue("UnifiedSubjectBrowse")
    UNIFIED_SUBJECT_BROWSE("UnifiedSubjectBrowse");
    private final String value;

    SearchConceptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchConceptType fromValue(String v) {
        for (SearchConceptType c: SearchConceptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
