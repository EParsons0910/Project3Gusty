package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class OfficeMan extends LoginAccount {
    String firstName; 
    String lastName;
    String email;
    String username;
    String password;
    
   
    
    public OfficeMan(String fn, String ln, String em, String un, String pw){
        firstName = fn;
        lastName = ln;
        email = em;
        username = un;
        password = pw;
    }
}
