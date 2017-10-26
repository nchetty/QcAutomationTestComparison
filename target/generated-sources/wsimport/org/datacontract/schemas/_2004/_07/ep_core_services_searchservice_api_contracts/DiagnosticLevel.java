
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Info"/>
 *     &lt;enumeration value="Debug"/>
 *     &lt;enumeration value="Verbose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticLevel", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum DiagnosticLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Verbose")
    VERBOSE("Verbose");
    private final String value;

    DiagnosticLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticLevel fromValue(String v) {
        for (DiagnosticLevel c: DiagnosticLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
