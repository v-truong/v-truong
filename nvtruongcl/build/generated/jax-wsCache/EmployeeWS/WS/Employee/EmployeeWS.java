
package WS.Employee;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeWS", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "remove", targetNamespace = "http://soap/", className = "WS.Employee.Remove")
    @ResponseWrapper(localName = "removeResponse", targetNamespace = "http://soap/", className = "WS.Employee.RemoveResponse")
    @Action(input = "http://soap/EmployeeWS/removeRequest", output = "http://soap/EmployeeWS/removeResponse")
    public String remove(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns WS.Employee.Tblemployee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://soap/", className = "WS.Employee.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://soap/", className = "WS.Employee.FindResponse")
    @Action(input = "http://soap/EmployeeWS/findRequest", output = "http://soap/EmployeeWS/findResponse")
    public Tblemployee find(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://soap/", className = "WS.Employee.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://soap/", className = "WS.Employee.SaveResponse")
    @Action(input = "http://soap/EmployeeWS/saveRequest", output = "http://soap/EmployeeWS/saveResponse")
    public String save(
        @WebParam(name = "arg0", targetNamespace = "")
        Tblemployee arg0);

    /**
     * 
     * @return
     *     returns java.util.List<WS.Employee.Tblemployee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeList", targetNamespace = "http://soap/", className = "WS.Employee.GetEmployeeList")
    @ResponseWrapper(localName = "getEmployeeListResponse", targetNamespace = "http://soap/", className = "WS.Employee.GetEmployeeListResponse")
    @Action(input = "http://soap/EmployeeWS/getEmployeeListRequest", output = "http://soap/EmployeeWS/getEmployeeListResponse")
    public List<Tblemployee> getEmployeeList();

}
