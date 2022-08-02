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
   public String menue1Link = "news.xhtml?faces-redirect=true";
   public String homeLink = "index.xhtml?faces-redirect=true";
   public String menue2Link = "commonDocuments.xhtml?faces-redirect=true";
   public String menue3Link = "phoneList.xhtml?faces-redirect=true";
   public String menue4Link = "newsManagement.xhtml?faces-redirect=true";
   public String menue5Link = "http://support/ticket/kb/index.php";
   public String menue6Link = "editphonenr.xhtml?faces-redirect=true";
   
   public String menue1Img = "fa-solid fa-newspaper fa-1x";
   public String homeImg;
   public String menue2Img = "fa-solid fa-file-lines fa-1x";
   public String menue3Img = "fa-solid fa-phone fa-1x";
   public String menue4Img;
   public String menue5Img = "fa-solid fa-brain fa-1x";
   public String menue6Img = "fa-solid fa-question fa-1x";
   
   public String menue1Name = "News";
   public String homeName = "Home";
   public String menue2Name ="Gemeinsame Dokumente";
   public String menue3Name = "Telefonliste";
   public String menue4Name = "News-Eintrag hinzufügen";
   public String menue5Name = "Wissens-Datenbank";
   public String menue6Name = "Telefonnummer hinzufügen";
   
   public String menue1ImgName = menue1Img + " &nbsp; " + menue1Name;
   public String homeImgName;
   public String menue2ImgName = menue2Img + " &nbsp; " + menue2Name;
   public String menue3ImgName = menue3Img + " &nbsp; " + menue3Name;
   public String menue4ImgName = menue4Img + " &nbsp; " + menue4Name;
   public String menue5ImgName = menue5Img + " &nbsp; " + menue5Name;
   public String menue6ImgName = menue6Img + " &nbsp; " + menue6Name;
   
   
   /*****************************************
   *Getter-Methoden für LINKS
   *****************************************/
   public String getMenue1Link() { 
      return menue1Link;
   }
   
   public String getHomeLink(){
       return homeLink;
   }
   
   public String getMenue2Link(){
       return menue2Link;
   }
   public String getMenue3Link(){
       return menue3Link;
   }
   
   public String getMenue4Link(){
       return menue4Link;       
   }
   
   public String getMenue5Link(){
       return menue5Link;
   }
   
   public String getMenue6Link(){
       return menue6Link;
   }
   
   
   /*****************************************
   *Getter-Methoden für BILDER
   *****************************************/
   
   public String getMenue1Img(){
       return menue1Img;
   }
   
   public String getHomeImg(){
       return homeImg;
   }
   
   public String getmenue2Img(){
       return menue2Img;
   }
   
   public String getmenue3Img(){
       return menue3Img;
   }
   
   public String getMenue4Img(){
       return menue4Img;
   }
   
   public String getMenue5Img(){
       return menue5Img;
   }
   
   public String getMenue6Img(){
       return menue6Img;
   }
   
   /*****************************************
   *Getter-Methoden für NAMEN
   *****************************************/
    
   public String getMenue1Name(){
       return menue1Name;
   }
   
   public String getHomeName(){
       return homeName;
   }
   
   public String getMenue2Name(){
       return menue2Name;
   }
   
   public String getMenue3Name(){
       return menue3Name;
   }
   
   public String getMenue4Name(){
       return menue4Name;
   }
   
   public String getMenue5Name(){
       return menue5Name;
   }
   
   public String getMenue6Name(){
       return menue6Name;
   }  
   
   /*****************************************
   *Getter-Methoden für NAME & BILDER
   *****************************************/
   
   public String getMenue1ImgName(){
       return menue1ImgName;
   }
   
   public String getHomeImgName(){
       return homeImgName;
   }
   
   public String getmenue2ImgName(){
       return menue2ImgName;
   }
   
   public String getmenue3ImgName(){
       return menue3ImgName;
   }
   
   public String getMenue4ImgName(){
       return menue4ImgName;
   }
   
   public String getMenue5ImgName(){
       return menue5ImgName;
   }
   
   public String getMenue6ImgName(){
       return menue6ImgName;
   }
}
