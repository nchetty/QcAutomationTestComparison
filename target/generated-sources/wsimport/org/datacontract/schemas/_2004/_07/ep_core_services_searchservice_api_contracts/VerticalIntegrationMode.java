
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalIntegrationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerticalIntegrationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Integrate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerticalIntegrationMode", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum VerticalIntegrationMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Integrate")
    INTEGRATE("Integrate");
    private final String value;

    VerticalIntegrationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerticalIntegrationMode fromValue(String v) {
        for (VerticalIntegrationMode c: VerticalIntegrationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
