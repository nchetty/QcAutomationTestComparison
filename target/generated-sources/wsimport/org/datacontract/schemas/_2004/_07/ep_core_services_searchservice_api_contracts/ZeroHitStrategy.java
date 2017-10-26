
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZeroHitStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZeroHitStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SmartTextFailover"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZeroHitStrategy", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum ZeroHitStrategy {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SmartTextFailover")
    SMART_TEXT_FAILOVER("SmartTextFailover");
    private final String value;

    ZeroHitStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZeroHitStrategy fromValue(String v) {
        for (ZeroHitStrategy c: ZeroHitStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
