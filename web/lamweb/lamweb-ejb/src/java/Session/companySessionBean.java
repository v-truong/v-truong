/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import entity.Company;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author MSI BRAVO 15
 */
@Stateless
public class companySessionBean implements companySessionBeanLocal {

    @Override
    public List<Company> findAll() {
         EntityManagerFactory factory = Persistence.createEntityManagerFactory("lamweb-ejbPU");
        EntityManager em = factory.createEntityManager();
        
        Query q = em.createNamedQuery("Company.findAll", Company.class);
        
        return q.getResultList();
    }

    @Override
    public void insert(Company company) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("lamweb-ejbPU");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(Company);
        em.getTransaction().commit();
    }

    @Override
    public void delete(String bookCode) {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("lamweb-ejbPU");
        EntityManager em = factory.createEntityManager();
        
        Company company = em.find(Company.class, bookCode);
        
        em.getTransaction().begin();
        em.remove(company);
        em.getTransaction().commit();
    }

    @Override
    public void update(Company book) {
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookWeb-ejbPU");
        EntityManager em = factory.createEntityManager();
        
        Company companyfin = em.find(companyfin.class, book.getBookcode());
        
        em.getTransaction().begin();
        companyfin.setName(book.getName());
        companyfin.setNickname(book.getNickname());
        companyfin.setNxb(book.getNxb());
        companyfin.setPrice(book.getPrice());
        em.getTransaction().commit();
    }

    @Override
    public Company find(String companyCode) {
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
