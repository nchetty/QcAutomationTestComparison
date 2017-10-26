
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchProgressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchProgressStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchProgressStatus", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum SearchProgressStatus {

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    SearchProgressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchProgressStatus fromValue(String v) {
        for (SearchProgressStatus c: SearchProgressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
