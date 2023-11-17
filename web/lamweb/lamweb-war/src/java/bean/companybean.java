/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Session.companySessionBeanLocal;
import entity.Company;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;

/**
 *
 * @author MSI BRAVO 15
 */
@ManagedBean(name = "companybean")
public class companybean  implements Serializable {
     @EJB
    private companySessionBeanLocal bookSessionBean;
    private Company book;
    
    public companybean() {
        this.book = new Book();
    }
    
    public List<Book> getBookList() {
        return bookSessionBean.findAll();
    }
    
    public void delete(String bookCode) {
        bookSessionBean.delete(bookCode);
    }
    
    public String edit(String bookCode) {
        book = bookSessionBean.find(bookCode);
        return "editbook";
    }
    
    public Book getBook() {
        return book;
    }
    
    public void insert() {
        bookSessionBean.insert(book);
    }
    
    public void update() {
        bookSessionBean.update(book);
    }
}
