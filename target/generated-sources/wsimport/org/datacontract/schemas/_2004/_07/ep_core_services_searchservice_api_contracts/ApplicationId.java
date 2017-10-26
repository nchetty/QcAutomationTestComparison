
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Edsapi"/>
 *     &lt;enumeration value="Eit"/>
 *     &lt;enumeration value="Ehost"/>
 *     &lt;enumeration value="Rss"/>
 *     &lt;enumeration value="Sdi"/>
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="ZGateway"/>
 *     &lt;enumeration value="AutoCompleteHarvester"/>
 *     &lt;enumeration value="Meerkat"/>
 *     &lt;enumeration value="ExportService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationId", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum ApplicationId {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Edsapi")
    EDSAPI("Edsapi"),
    @XmlEnumValue("Eit")
    EIT("Eit"),
    @XmlEnumValue("Ehost")
    EHOST("Ehost"),
    @XmlEnumValue("Rss")
    RSS("Rss"),
    @XmlEnumValue("Sdi")
    SDI("Sdi"),
    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("ZGateway")
    Z_GATEWAY("ZGateway"),
    @XmlEnumValue("AutoCompleteHarvester")
    AUTO_COMPLETE_HARVESTER("AutoCompleteHarvester"),
    @XmlEnumValue("Meerkat")
    MEERKAT("Meerkat"),
    @XmlEnumValue("ExportService")
    EXPORT_SERVICE("ExportService");
    private final String value;

    ApplicationId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationId fromValue(String v) {
        for (ApplicationId c: ApplicationId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
