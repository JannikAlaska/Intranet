/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Transient;

/**
 *
 * @author Berthold
 */
@ManagedBean
@RequestScoped
@Entity
public class Bereiche implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String bereich;
    @OneToMany
    private List<Numbers> numbers;
    @Transient
    public List<Bereiche> bereicheLst = new ArrayList<>();
    @Transient
    private static Bereiche instance = new Bereiche();
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntranetPU");

    /**
     * Creates a new instance of Bereiche
     */
    public Bereiche() {
    }
    
    public int getId(){
        return id;
    }

    public String getBereich(){
        return bereich;
    }  
    
     public void setId(int id){
        this.id=id;
    }
    
    public void setBereich(String bereich){
        this.bereich=bereich;
    }
    
    public List<Bereiche> getBereichLst(){
    EntityManager em = emf.createEntityManager();
    Query q;
    q = em.createQuery("SELECT bereich FROM Bereiche a order by a.bereich asc");
    List<Bereiche> bereicheLst = q.getResultList();
    em.close();
    return bereicheLst;
    }
}
