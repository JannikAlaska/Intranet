/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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
    @ManyToOne(targetEntity=Bereiche.class)
    @JoinColumn(name="bereich_ID", referencedColumnName="id")
    public Bereiche bereich;
    public int bereich_id;
    
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
         
    public Bereiche getBereich(){
        return bereich;
    }
         
    public int getBereich_ID(){
        return bereich_id;
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
    
    public void setBereich(Bereiche bereich){
        this.bereich=bereich;
    }
    
    public void setBereich_ID(int bereich_id){
        this.bereich_id=bereich_id;
    }
    
    
    
    
    
}
