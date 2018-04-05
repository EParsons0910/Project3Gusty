/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

/**
 *
 * @author Elizabeth Parsons
 */
import java.util.Scanner;
import java.io.Serializable;

public class SysAdmin {
    private String fn;
    private String ln;
    private String em;
    private String un;
    private String pw;
    
    SysAdmin(String fn, String ln, String em, String un, String pw){
        this.fn = fn;
        this.ln = ln;
        this.em = em;
        this.un = un;
        this.pw = pw;
                
    }
    
    public String getFirstName(){
        return fn;
    }
    
    public String getLastName(){
        return ln;
    }
    
    public String getEMail(){
        return em;
    }
    
    public String getUserName(){
        return un;
    }
    
    public String getPassWord(){
        return pw;
    }

    public void addOfficeMan(){
        
    }
}
