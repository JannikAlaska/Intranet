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
    private String vorname;
    private String nachname;
    private String number;
    private String fax;
    public Numbers newNumber = null;
    
    /**
     * Creates a new instance of Numbers
     */
    public Numbers(){
        
    }
    
    public Numbers(String nachname, String vorname, String number) {
        this.nachname=nachname;
        this.vorname=vorname;
        this.number=number;
    }

    public Numbers(String mitarbeiter, String nachname, String vorname, String number, String fax) {
        this.mitarbeiter=mitarbeiter;
        this.nachname=nachname;
        this.vorname=vorname;
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
    
    public String getNachname(){
        return nachname;
    }
    
    public String getVorname(){
        return vorname;
    }
    
    public String getNumber(){
        return number;
    }

    public String getFax(){
        return fax;
    }  
    
    public Numbers getNewNumber(){
        if (null == newNumber){
            this.newNumber=new Numbers();
        }   
        return this.newNumber;
    }
    
    //*Setter-Methoden
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setMitarbeiter(String mitarbeiter){
        this.mitarbeiter=mitarbeiter;
    }
    
    public void setNachname(String nachname){
        this.nachname=nachname;
    }
    
    public void setVorname(String vorname){
        this.vorname=vorname;
    }
    
    public void setNumber(String number){
        this.number=number;
    }
    
    public void setFax(String fax){
        this.fax=fax;
    }
    
   
    public String speichern(){
        newNumber=new Numbers(mitarbeiter, nachname, vorname, number, fax);
        Phonenr.getInstance().savePhonenr(newNumber);
        
        return null;
    }
    
}
