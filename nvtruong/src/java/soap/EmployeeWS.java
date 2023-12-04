/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import entity.Tblemployee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MSI BRAVO 15
 */
@WebService(serviceName = "EmployeeWS")
public class EmployeeWS {

    /**
     * API: Lay danh sach sinh vien => lay tat ca sinh vien trong CSDL ra.
     * @return 
     */
    @WebMethod
    public List<Tblemployee> getEmployeeList() {
        //Tao connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("nvtruongPU");
        EntityManager em = factory.createEntityManager();
        
        Query q = em.createNamedQuery("Tblemployee.findAll", Tblemployee.class);
        
        return q.getResultList();
    }
    
    /**
     * API: Lam 2 nhiem vu - Them/Sua thong tin sinh vien
     * TH1: Neu rollnumber => khong ton tai => Them moi
     * TH2: Neu rollnumber => ton tai => update
     * @param std
     * @return 
     */
    @WebMethod
    public String save(Tblemployee std) {
        //Tao connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("nvtruongPU");
        EntityManager em = factory.createEntityManager();
        
        //Tim xem sinh vien da ton tai trong he thong chua
        Tblemployee stdFind = em.find(Tblemployee.class, std.getEmployeeNo());
        
        if(stdFind != null) {
            //Update
            em.getTransaction().begin();
            stdFind.setEmployeename(std.getEmployeename());
            stdFind.setPhoneNo(std.getPhoneNo());
            stdFind.setPlaceOfWork(std.getPlaceOfWork());
            em.getTransaction().commit();
            
            return "update success";
        } else {
            //Insert
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "insert success";
        }
    }
    
    /**
     * Tim kiem thong tin sinh vien trong database
     * @param rollnumber
     * @return 
     */
    @WebMethod
    public Tblemployee find(String rollnumber) {
        //Tao connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("nvtruongPU");
        EntityManager em = factory.createEntityManager();
        
        //Tim xem sinh vien da ton tai trong he thong chua
        Tblemployee stdFind = em.find(Tblemployee.class, rollnumber);
        
        return stdFind;
    }
    
    /**
     * Xoa thong tin sinh vien theo rollnumber
     * @param rollnumber
     * @return 
     */
    @WebMethod
    public String remove(String rollnumber) {
        //Tao connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("nvtruongPU");
        EntityManager em = factory.createEntityManager();
        
        //Tim xem sinh vien da ton tai trong he thong chua
        Tblemployee stdFind = em.find(Tblemployee.class, rollnumber);
        
        if(stdFind != null) {
            //xoa sinh vien
            em.getTransaction().begin();
            em.remove(stdFind);
            em.getTransaction().commit();
            
            return "remove success";
        }
        
        return "remove failed";
    }
    
}
