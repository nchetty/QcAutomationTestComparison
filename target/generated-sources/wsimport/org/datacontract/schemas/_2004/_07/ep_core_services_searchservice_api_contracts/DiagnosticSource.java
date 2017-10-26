
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="AdminClient"/>
 *     &lt;enumeration value="Api"/>
 *     &lt;enumeration value="CcClient"/>
 *     &lt;enumeration value="Client"/>
 *     &lt;enumeration value="ContentEnhance"/>
 *     &lt;enumeration value="DatabaseAccessServer"/>
 *     &lt;enumeration value="DatabaseServer"/>
 *     &lt;enumeration value="Domain"/>
 *     &lt;enumeration value="DymClient"/>
 *     &lt;enumeration value="EisClient"/>
 *     &lt;enumeration value="Epkwic"/>
 *     &lt;enumeration value="Facets"/>
 *     &lt;enumeration value="FullTextRetrievalClient"/>
 *     &lt;enumeration value="IndexDataClient"/>
 *     &lt;enumeration value="KnowledgeBaseClient"/>
 *     &lt;enumeration value="MedQpClient"/>
 *     &lt;enumeration value="MatchingEnhancementLinkingClient"/>
 *     &lt;enumeration value="MatchingEnhancementLinkingService"/>
 *     &lt;enumeration value="MergeDedupe"/>
 *     &lt;enumeration value="ParserEngine"/>
 *     &lt;enumeration value="SearchCache"/>
 *     &lt;enumeration value="SegmentationClient"/>
 *     &lt;enumeration value="SreClient"/>
 *     &lt;enumeration value="XsltProcessor"/>
 *     &lt;enumeration value="TimerSummary"/>
 *     &lt;enumeration value="VBRSClient"/>
 *     &lt;enumeration value="TransactionLogger"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticSource", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum DiagnosticSource {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AdminClient")
    ADMIN_CLIENT("AdminClient"),
    @XmlEnumValue("Api")
    API("Api"),
    @XmlEnumValue("CcClient")
    CC_CLIENT("CcClient"),
    @XmlEnumValue("Client")
    CLIENT("Client"),
    @XmlEnumValue("ContentEnhance")
    CONTENT_ENHANCE("ContentEnhance"),
    @XmlEnumValue("DatabaseAccessServer")
    DATABASE_ACCESS_SERVER("DatabaseAccessServer"),
    @XmlEnumValue("DatabaseServer")
    DATABASE_SERVER("DatabaseServer"),
    @XmlEnumValue("Domain")
    DOMAIN("Domain"),
    @XmlEnumValue("DymClient")
    DYM_CLIENT("DymClient"),
    @XmlEnumValue("EisClient")
    EIS_CLIENT("EisClient"),
    @XmlEnumValue("Epkwic")
    EPKWIC("Epkwic"),
    @XmlEnumValue("Facets")
    FACETS("Facets"),
    @XmlEnumValue("FullTextRetrievalClient")
    FULL_TEXT_RETRIEVAL_CLIENT("FullTextRetrievalClient"),
    @XmlEnumValue("IndexDataClient")
    INDEX_DATA_CLIENT("IndexDataClient"),
    @XmlEnumValue("KnowledgeBaseClient")
    KNOWLEDGE_BASE_CLIENT("KnowledgeBaseClient"),
    @XmlEnumValue("MedQpClient")
    MED_QP_CLIENT("MedQpClient"),
    @XmlEnumValue("MatchingEnhancementLinkingClient")
    MATCHING_ENHANCEMENT_LINKING_CLIENT("MatchingEnhancementLinkingClient"),
    @XmlEnumValue("MatchingEnhancementLinkingService")
    MATCHING_ENHANCEMENT_LINKING_SERVICE("MatchingEnhancementLinkingService"),
    @XmlEnumValue("MergeDedupe")
    MERGE_DEDUPE("MergeDedupe"),
    @XmlEnumValue("ParserEngine")
    PARSER_ENGINE("ParserEngine"),
    @XmlEnumValue("SearchCache")
    SEARCH_CACHE("SearchCache"),
    @XmlEnumValue("SegmentationClient")
    SEGMENTATION_CLIENT("SegmentationClient"),
    @XmlEnumValue("SreClient")
    SRE_CLIENT("SreClient"),
    @XmlEnumValue("XsltProcessor")
    XSLT_PROCESSOR("XsltProcessor"),
    @XmlEnumValue("TimerSummary")
    TIMER_SUMMARY("TimerSummary"),
    @XmlEnumValue("VBRSClient")
    VBRS_CLIENT("VBRSClient"),
    @XmlEnumValue("TransactionLogger")
    TRANSACTION_LOGGER("TransactionLogger");
    private final String value;

    DiagnosticSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticSource fromValue(String v) {
        for (DiagnosticSource c: DiagnosticSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
