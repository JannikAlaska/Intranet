/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Berthold
 */
@ManagedBean 
@ApplicationScoped
public class Phonenr {
    
    public List<Numbers> numbers = new ArrayList<>();
    private static Phonenr instance = new Phonenr();
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntranetPU");
    public String message ="";
    
    /**
     * Creates a new instance of phone
     */
    public Phonenr() {
        Persistence.createEntityManagerFactory("IntranetPU");
    }
    
    public List<Numbers> getNumbersLst(){
        EntityManager em = emf.createEntityManager();
        String msg="";
        try{
            Query q;
            q = em.createQuery("SELECT a FROM Numbers a order by a.nachname asc");
            List<Numbers> numbersResult = q.getResultList();
            
            return numbersResult;
        } catch (Exception e) {
            this.message=msg + "Eine Exception wurde geworfen:" + e.getMessage();
            return null;
        } finally {
            em.close();
            this.message=msg;
        }
        
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message=message;
    }
    
    public static Phonenr getInstance(){
        return instance;
    }
    
    void savePhonenr(Numbers newNumber){
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(newNumber);
        t.commit();
        em.close();
    }
}