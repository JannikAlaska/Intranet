/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Berthold
 */

public class PhoneNr {
    
    public List<Numbers> numbers = new ArrayList<>();
    private static PhoneNr instance = new PhoneNr();
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("intranet");
    
    /**
     * Creates a new instance of phone
     */
    public PhoneNr() {
        
    }
    
    public List<Numbers> getNumbersLst(){
        EntityManager em = emf.createEntityManager();
        
        Query q;
        q = em.createQuery("select a from Numbers a");
        List<Numbers> numbersResult = q.getResultList();
        
        return numbersResult;
    }
    
    
}