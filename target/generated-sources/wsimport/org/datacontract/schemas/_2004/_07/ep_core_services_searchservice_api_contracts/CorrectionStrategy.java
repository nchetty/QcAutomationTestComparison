
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectionStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorrectionStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DYM"/>
 *     &lt;enumeration value="AutoCorrect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CorrectionStrategy", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum CorrectionStrategy {

    @XmlEnumValue("None")
    NONE("None"),
    DYM("DYM"),
    @XmlEnumValue("AutoCorrect")
    AUTO_CORRECT("AutoCorrect");
    private final String value;

    CorrectionStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorrectionStrategy fromValue(String v) {
        for (CorrectionStrategy c: CorrectionStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
