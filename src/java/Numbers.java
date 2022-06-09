/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Berthold
 */
@ManagedBean
@RequestScoped

@Entity
public class Numbers implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String mitarbeiter;
    private String number;
    private String fax;
    
    /**
     * Creates a new instance of Numbers
     */
    public Numbers(){
        
    }
    
    public Numbers(String mitarbeiter, String number) {
        this.mitarbeiter=mitarbeiter;
        this.number=number;
    }

    public Numbers(String mitarbeiter, String number, String fax) {
        this.mitarbeiter=mitarbeiter;
        this.number=number;
        this.fax=fax;
    }
    
    //* Getter-Methoden
    
    public int getId(){
        return id;
    }
    
    public String getMitarbeiter(){
        return mitarbeiter;
    }
    
    public String getNumber(){
        return number;
    }

    public String getFax(){
        return fax;
    }  
    
    //*Setter-Methoden
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setMitarbeiter(String mitarbeiter){
        this.mitarbeiter=mitarbeiter;
    }
    
    public void setNumber(String number){
        this.number=number;
    }
    
    public void setFax(String fax){
        this.fax=fax;
    }
    
}
