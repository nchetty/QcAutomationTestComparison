
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BirBrief"/>
 *     &lt;enumeration value="BirBrowse"/>
 *     &lt;enumeration value="BirDetail"/>
 *     &lt;enumeration value="Brief"/>
 *     &lt;enumeration value="Brief2"/>
 *     &lt;enumeration value="Brief2AndFT"/>
 *     &lt;enumeration value="BriefAndFT"/>
 *     &lt;enumeration value="Citation"/>
 *     &lt;enumeration value="Cluster"/>
 *     &lt;enumeration value="DetailedScan"/>
 *     &lt;enumeration value="DirectEx"/>
 *     &lt;enumeration value="ExpandedScan"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Full2"/>
 *     &lt;enumeration value="GenZ1"/>
 *     &lt;enumeration value="GenZ2"/>
 *     &lt;enumeration value="GenZ3"/>
 *     &lt;enumeration value="FullNoCitation"/>
 *     &lt;enumeration value="MARC"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="NovBrief"/>
 *     &lt;enumeration value="NovBrowse"/>
 *     &lt;enumeration value="NovDetail"/>
 *     &lt;enumeration value="NovTree"/>
 *     &lt;enumeration value="NovTreeResults"/>
 *     &lt;enumeration value="Scan"/>
 *     &lt;enumeration value="Scan2"/>
 *     &lt;enumeration value="ScanQualifier"/>
 *     &lt;enumeration value="ScanTree"/>
 *     &lt;enumeration value="Raw"/>
 *     &lt;enumeration value="RecordInfo"/>
 *     &lt;enumeration value="RecordInfoBrief"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordFormat", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data")
@XmlEnum
public enum RecordFormat {

    @XmlEnumValue("BirBrief")
    BIR_BRIEF("BirBrief"),
    @XmlEnumValue("BirBrowse")
    BIR_BROWSE("BirBrowse"),
    @XmlEnumValue("BirDetail")
    BIR_DETAIL("BirDetail"),
    @XmlEnumValue("Brief")
    BRIEF("Brief"),
    @XmlEnumValue("Brief2")
    BRIEF_2("Brief2"),
    @XmlEnumValue("Brief2AndFT")
    BRIEF_2_AND_FT("Brief2AndFT"),
    @XmlEnumValue("BriefAndFT")
    BRIEF_AND_FT("BriefAndFT"),
    @XmlEnumValue("Citation")
    CITATION("Citation"),
    @XmlEnumValue("Cluster")
    CLUSTER("Cluster"),
    @XmlEnumValue("DetailedScan")
    DETAILED_SCAN("DetailedScan"),
    @XmlEnumValue("DirectEx")
    DIRECT_EX("DirectEx"),
    @XmlEnumValue("ExpandedScan")
    EXPANDED_SCAN("ExpandedScan"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Full2")
    FULL_2("Full2"),
    @XmlEnumValue("GenZ1")
    GEN_Z_1("GenZ1"),
    @XmlEnumValue("GenZ2")
    GEN_Z_2("GenZ2"),
    @XmlEnumValue("GenZ3")
    GEN_Z_3("GenZ3"),
    @XmlEnumValue("FullNoCitation")
    FULL_NO_CITATION("FullNoCitation"),
    MARC("MARC"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("NovBrief")
    NOV_BRIEF("NovBrief"),
    @XmlEnumValue("NovBrowse")
    NOV_BROWSE("NovBrowse"),
    @XmlEnumValue("NovDetail")
    NOV_DETAIL("NovDetail"),
    @XmlEnumValue("NovTree")
    NOV_TREE("NovTree"),
    @XmlEnumValue("NovTreeResults")
    NOV_TREE_RESULTS("NovTreeResults"),
    @XmlEnumValue("Scan")
    SCAN("Scan"),
    @XmlEnumValue("Scan2")
    SCAN_2("Scan2"),
    @XmlEnumValue("ScanQualifier")
    SCAN_QUALIFIER("ScanQualifier"),
    @XmlEnumValue("ScanTree")
    SCAN_TREE("ScanTree"),
    @XmlEnumValue("Raw")
    RAW("Raw"),
    @XmlEnumValue("RecordInfo")
    RECORD_INFO("RecordInfo"),
    @XmlEnumValue("RecordInfoBrief")
    RECORD_INFO_BRIEF("RecordInfoBrief");
    private final String value;

    RecordFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordFormat fromValue(String v) {
        for (RecordFormat c: RecordFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
