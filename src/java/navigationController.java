/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class navigationController {
   public String news() {
      return "news?faces-redirect=true";
   }
   
   public String home(){
       return "index?faces-redirect=true";
   }
   
   public String commonDocuments(){
       return "commonDocuments?faces-redirect=true";
   }
   public String phoneList(){
       return "phoneList?faces-redirect=true";
   }
   
   public String newsManagement(){
       return "newsManagement?faces-redirect=true";       
   }
   
   public String wissensDB(){
       return "http://support/ticket/kb/index.phphttp://support/ticket/kb/index.php";
   }
}
