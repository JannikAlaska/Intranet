/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean
@RequestScoped
public class News {
    

    ArrayList<Artikel> news = new ArrayList<>();
    private static News instance = new News();
    
    public String ueberschrift = "Fake-News";
    public String author = "Jannik Berthold";
    public String message = "Lorem ipsum";
    public Calendar createDate;

    /**
     * Creates a new instance of News
     */
    public News() {
        news.add(new Artikel("","","",LocalDateTime.now())) ;  
    }
    
    public ArrayList<Artikel> getNews(){
        return news;
    }
    
    public static News getInstance(){
        return instance;
    }
    
    public String getUeberschrift(){
        return this.ueberschrift;
    }  
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public Calendar getCreateDate(){
        return this.createDate;
    }    
 }
