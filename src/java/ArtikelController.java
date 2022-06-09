/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean
@ViewScoped
public class ArtikelController{
    
    private int index = 0;
    
    /**
     * Creates a new instance of ArtikelController
     */
    public ArtikelController() {
    }
    
    public Artikel getArtikel(){
        return News.getInstance().getNews().get(index);
    }
    
    public void vor(){
        if (index < News.getInstance().getNews().size()-1)
            index++;
    }
    
    public void zurueck(){
        if (index>0)
            index--;
    }
}
