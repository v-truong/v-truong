/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Company;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author MSI BRAVO 15
 */
@Remote
public interface companySessionBeanRemote {
    List<Company> findAll();
    Company find(int id);
    void insert(Company company);
    void update(Company company);
    
    
}
