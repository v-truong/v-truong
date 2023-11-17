/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import entity.Company;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MSI BRAVO 15
 */
@Local
public interface companySessionBeanLocal {
    List<Company> findAll();
    
    void insert(Company company);
    
    void delete(String bookCode);
    
    void update(Company book);
    
    Company find(String companyCode);
}
