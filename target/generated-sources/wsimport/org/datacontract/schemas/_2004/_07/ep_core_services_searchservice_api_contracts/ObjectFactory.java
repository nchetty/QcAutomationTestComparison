
package org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExpressionOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "ExpressionOperator");
    private final static QName _ZeroHitStrategy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "ZeroHitStrategy");
    private final static QName _SearchConceptType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "SearchConceptType");
    private final static QName _RecordFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "RecordFormat");
    private final static QName _SearchMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "SearchMode");
    private final static QName _DiagnosticDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "DiagnosticDestination");
    private final static QName _DiagnosticSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "DiagnosticSource");
    private final static QName _CorrectionStrategy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "CorrectionStrategy");
    private final static QName _ExpanderCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "ExpanderCriteria");
    private final static QName _SearchContextFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "SearchContextFlags");
    private final static QName _DiagnosticLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "DiagnosticLevel");
    private final static QName _RecordFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "RecordFlags");
    private final static QName _ApplicationContextFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "ApplicationContextFlags");
    private final static QName _ApplicationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "ApplicationId");
    private final static QName _SearchProgressStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", "SearchProgressStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "ExpressionOperator")
    public JAXBElement<ExpressionOperator> createExpressionOperator(ExpressionOperator value) {
        return new JAXBElement<ExpressionOperator>(_ExpressionOperator_QNAME, ExpressionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZeroHitStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "ZeroHitStrategy")
    public JAXBElement<ZeroHitStrategy> createZeroHitStrategy(ZeroHitStrategy value) {
        return new JAXBElement<ZeroHitStrategy>(_ZeroHitStrategy_QNAME, ZeroHitStrategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchConceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "SearchConceptType")
    public JAXBElement<SearchConceptType> createSearchConceptType(SearchConceptType value) {
        return new JAXBElement<SearchConceptType>(_SearchConceptType_QNAME, SearchConceptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "RecordFormat")
    public JAXBElement<RecordFormat> createRecordFormat(RecordFormat value) {
        return new JAXBElement<RecordFormat>(_RecordFormat_QNAME, RecordFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "SearchMode")
    public JAXBElement<SearchMode> createSearchMode(SearchMode value) {
        return new JAXBElement<SearchMode>(_SearchMode_QNAME, SearchMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "DiagnosticDestination")
    public JAXBElement<List<String>> createDiagnosticDestination(List<String> value) {
        return new JAXBElement<List<String>>(_DiagnosticDestination_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "DiagnosticSource")
    public JAXBElement<DiagnosticSource> createDiagnosticSource(DiagnosticSource value) {
        return new JAXBElement<DiagnosticSource>(_DiagnosticSource_QNAME, DiagnosticSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrectionStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "CorrectionStrategy")
    public JAXBElement<CorrectionStrategy> createCorrectionStrategy(CorrectionStrategy value) {
        return new JAXBElement<CorrectionStrategy>(_CorrectionStrategy_QNAME, CorrectionStrategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "ExpanderCriteria")
    public JAXBElement<List<String>> createExpanderCriteria(List<String> value) {
        return new JAXBElement<List<String>>(_ExpanderCriteria_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "SearchContextFlags")
    public JAXBElement<List<String>> createSearchContextFlags(List<String> value) {
        return new JAXBElement<List<String>>(_SearchContextFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "DiagnosticLevel")
    public JAXBElement<DiagnosticLevel> createDiagnosticLevel(DiagnosticLevel value) {
        return new JAXBElement<DiagnosticLevel>(_DiagnosticLevel_QNAME, DiagnosticLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "RecordFlags")
    public JAXBElement<List<String>> createRecordFlags(List<String> value) {
        return new JAXBElement<List<String>>(_RecordFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "ApplicationContextFlags")
    public JAXBElement<List<String>> createApplicationContextFlags(List<String> value) {
        return new JAXBElement<List<String>>(_ApplicationContextFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "ApplicationId")
    public JAXBElement<ApplicationId> createApplicationId(ApplicationId value) {
        return new JAXBElement<ApplicationId>(_ApplicationId_QNAME, ApplicationId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProgressStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.SearchService.API.Contracts.Data", name = "SearchProgressStatus")
    public JAXBElement<SearchProgressStatus> createSearchProgressStatus(SearchProgressStatus value) {
        return new JAXBElement<SearchProgressStatus>(_SearchProgressStatus_QNAME, SearchProgressStatus.class, null, value);
    }

}
