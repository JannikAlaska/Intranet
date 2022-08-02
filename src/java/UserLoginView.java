/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Berthold
 */
@ManagedBean
@SessionScoped
public class UserLoginView {
    private String username;
    private String password;
    public boolean generalLoggedIn=false;
    public boolean generalLoggedOut=true;
    public String actualPage;

    public String getActualPage() {
        return actualPage;
    }
    
    public boolean getGeneralLoggedOut() {
        return generalLoggedOut;
    }

    public void setGeneralLoggedIn(boolean generalLoggedIn) {
        this.generalLoggedIn = generalLoggedIn;
    }
 
    public String getUsername() {
        return username;
    }

    public boolean getGeneralLoggedIn() {
        return generalLoggedIn;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public String login() {
        FacesMessage message = null;
        boolean loggedIn = false;
        boolean loggedOut = true;;
         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            loggedOut=false;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            loggedOut=true;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
        
        this.generalLoggedIn=loggedIn;
        this.generalLoggedOut=loggedOut;
        
        FacesContext context = FacesContext.getCurrentInstance();
        return context.getViewRoot().getViewId() + "?faces-redirect=true";
    }  
    
    public String logout(){
        String actualPage;
        this.generalLoggedIn = false;
        this.generalLoggedOut = true;
        this.username = null;
        this.password = null;
        
        FacesContext context = FacesContext.getCurrentInstance();
        actualPage= context.getViewRoot().getViewId();
        if (actualPage.equals("/newsManagement.xhtml")){
            return "news.xhtml?faces-redirect=true";
        }
        this.actualPage=actualPage;
        return actualPage + "?faces-redirect=true";
    }
}