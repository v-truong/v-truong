/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import javax.ejb.Local;

/**
 *
 * @author MSI BRAVO 15
 */
@Local
public interface companySessionBeanLocal {
    List<Com> findAll();
    
    void insert(Book book);
    
    void delete(String bookCode);
    
    void update(Book book);
    
    Book find(String bookCode);
}
