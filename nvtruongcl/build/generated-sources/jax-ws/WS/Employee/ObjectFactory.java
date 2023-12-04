
package WS.Employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS.Employee package. 
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

    private final static QName _FindResponse_QNAME = new QName("http://soap/", "findResponse");
    private final static QName _GetEmployeeList_QNAME = new QName("http://soap/", "getEmployeeList");
    private final static QName _RemoveResponse_QNAME = new QName("http://soap/", "removeResponse");
    private final static QName _Save_QNAME = new QName("http://soap/", "save");
    private final static QName _Remove_QNAME = new QName("http://soap/", "remove");
    private final static QName _SaveResponse_QNAME = new QName("http://soap/", "saveResponse");
    private final static QName _Tblemployee_QNAME = new QName("http://soap/", "tblemployee");
    private final static QName _GetEmployeeListResponse_QNAME = new QName("http://soap/", "getEmployeeListResponse");
    private final static QName _Find_QNAME = new QName("http://soap/", "find");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS.Employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeListResponse }
     * 
     */
    public GetEmployeeListResponse createGetEmployeeListResponse() {
        return new GetEmployeeListResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link GetEmployeeList }
     * 
     */
    public GetEmployeeList createGetEmployeeList() {
        return new GetEmployeeList();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link Tblemployee }
     * 
     */
    public Tblemployee createTblemployee() {
        return new Tblemployee();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getEmployeeList")
    public JAXBElement<GetEmployeeList> createGetEmployeeList(GetEmployeeList value) {
        return new JAXBElement<GetEmployeeList>(_GetEmployeeList_QNAME, GetEmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "removeResponse")
    public JAXBElement<RemoveResponse> createRemoveResponse(RemoveResponse value) {
        return new JAXBElement<RemoveResponse>(_RemoveResponse_QNAME, RemoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tblemployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "tblemployee")
    public JAXBElement<Tblemployee> createTblemployee(Tblemployee value) {
        return new JAXBElement<Tblemployee>(_Tblemployee_QNAME, Tblemployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getEmployeeListResponse")
    public JAXBElement<GetEmployeeListResponse> createGetEmployeeListResponse(GetEmployeeListResponse value) {
        return new JAXBElement<GetEmployeeListResponse>(_GetEmployeeListResponse_QNAME, GetEmployeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

}
