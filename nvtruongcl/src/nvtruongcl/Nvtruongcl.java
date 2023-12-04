/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nvtruongcl;

import WS.Employee.Tblemployee;

/**
 *
 * @author MSI BRAVO 15
 */
public class Nvtruongcl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static java.util.List<WS.Employee.Tblemployee> getEmployeeList() {
        WS.Employee.EmployeeWS_Service service = new WS.Employee.EmployeeWS_Service();
        WS.Employee.EmployeeWS port = service.getEmployeeWSPort();
        return port.getEmployeeList();
    }

    private static Tblemployee find(java.lang.String arg0) {
        WS.Employee.EmployeeWS_Service service = new WS.Employee.EmployeeWS_Service();
        WS.Employee.EmployeeWS port = service.getEmployeeWSPort();
        return port.find(arg0);
    }

    private static String remove(java.lang.String arg0) {
        WS.Employee.EmployeeWS_Service service = new WS.Employee.EmployeeWS_Service();
        WS.Employee.EmployeeWS port = service.getEmployeeWSPort();
        return port.remove(arg0);
    }

    private static String save(WS.Employee.Tblemployee arg0) {
        WS.Employee.EmployeeWS_Service service = new WS.Employee.EmployeeWS_Service();
        WS.Employee.EmployeeWS port = service.getEmployeeWSPort();
        return port.save(arg0);
    }
    
}
