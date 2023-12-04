/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MSI BRAVO 15
 */
@Entity
@Table(name = "tblemployee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblemployee.findAll", query = "SELECT t FROM Tblemployee t")
    , @NamedQuery(name = "Tblemployee.findByEmployeeNo", query = "SELECT t FROM Tblemployee t WHERE t.employeeNo = :employeeNo")
    , @NamedQuery(name = "Tblemployee.findByEmployeename", query = "SELECT t FROM Tblemployee t WHERE t.employeename = :employeename")
    , @NamedQuery(name = "Tblemployee.findByPlaceOfWork", query = "SELECT t FROM Tblemployee t WHERE t.placeOfWork = :placeOfWork")
    , @NamedQuery(name = "Tblemployee.findByPhoneNo", query = "SELECT t FROM Tblemployee t WHERE t.phoneNo = :phoneNo")})
public class Tblemployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "EmployeeNo")
    private String employeeNo;
    @Size(max = 30)
    @Column(name = "Employeename")
    private String employeename;
    @Size(max = 30)
    @Column(name = "placeOfWork")
    private String placeOfWork;
    @Size(max = 10)
    @Column(name = "PhoneNo")
    private String phoneNo;

    public Tblemployee() {
    }

    public Tblemployee(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeNo != null ? employeeNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblemployee)) {
            return false;
        }
        Tblemployee other = (Tblemployee) object;
        if ((this.employeeNo == null && other.employeeNo != null) || (this.employeeNo != null && !this.employeeNo.equals(other.employeeNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tblemployee[ employeeNo=" + employeeNo + " ]";
    }
    
}
