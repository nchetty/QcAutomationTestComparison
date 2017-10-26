
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentVerticalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentVerticalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AcademicJournals"/>
 *     &lt;enumeration value="Audiobooks"/>
 *     &lt;enumeration value="Images"/>
 *     &lt;enumeration value="EBooks"/>
 *     &lt;enumeration value="PrimarySources"/>
 *     &lt;enumeration value="Magazines"/>
 *     &lt;enumeration value="Reference"/>
 *     &lt;enumeration value="News"/>
 *     &lt;enumeration value="Biographies"/>
 *     &lt;enumeration value="ResearchStarters"/>
 *     &lt;enumeration value="TopicOverviews"/>
 *     &lt;enumeration value="TradePublications"/>
 *     &lt;enumeration value="Reviews"/>
 *     &lt;enumeration value="Videos"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentVerticalType", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum ContentVerticalType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AcademicJournals")
    ACADEMIC_JOURNALS("AcademicJournals"),
    @XmlEnumValue("Audiobooks")
    AUDIOBOOKS("Audiobooks"),
    @XmlEnumValue("Images")
    IMAGES("Images"),
    @XmlEnumValue("EBooks")
    E_BOOKS("EBooks"),
    @XmlEnumValue("PrimarySources")
    PRIMARY_SOURCES("PrimarySources"),
    @XmlEnumValue("Magazines")
    MAGAZINES("Magazines"),
    @XmlEnumValue("Reference")
    REFERENCE("Reference"),
    @XmlEnumValue("News")
    NEWS("News"),
    @XmlEnumValue("Biographies")
    BIOGRAPHIES("Biographies"),
    @XmlEnumValue("ResearchStarters")
    RESEARCH_STARTERS("ResearchStarters"),
    @XmlEnumValue("TopicOverviews")
    TOPIC_OVERVIEWS("TopicOverviews"),
    @XmlEnumValue("TradePublications")
    TRADE_PUBLICATIONS("TradePublications"),
    @XmlEnumValue("Reviews")
    REVIEWS("Reviews"),
    @XmlEnumValue("Videos")
    VIDEOS("Videos");
    private final String value;

    ContentVerticalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentVerticalType fromValue(String v) {
        for (ContentVerticalType c: ContentVerticalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
