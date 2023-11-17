/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Company;
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
public class companySessionBean implements companySessionBeanRemote {

   @Override
    public List<Company> findAll() {
        //Tao ket noi toi database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("compenyLibPU");
        EntityManager em = factory.createEntityManager();
        
        Query q = em.createNamedQuery("Company.findAll", Company.class);
        
        return q.getResultList();
    }

    @Override
    public Company find(int id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("compenyLibPU");
        EntityManager em = factory.createEntityManager();
        
        return em.find(Company.class, id);
    }

    @Override
    public void insert(Company company) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("compenyLibPU");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();
    }

    @Override
    public void update(Company company) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("compenyLibPU");
        EntityManager em = factory.createEntityManager();
        Company cmpFind = em.find(Company.class, company.getId());
        
        em.getTransaction().begin();
        cmpFind.setAddress(company.getAddress());
        cmpFind.setCompanyKey(company.getCompanyKey());
        cmpFind.setDescription(company.getDescription());
        cmpFind.setEnabled(company.getEnabled());
        cmpFind.setName(company.getName());
        em.getTransaction().commit();
    }


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
