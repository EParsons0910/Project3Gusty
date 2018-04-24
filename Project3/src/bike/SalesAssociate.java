package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class SalesAssociate extends LoginAccount {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    
    SalesAssociate(String fn, String ln, String em, String un, String pw){
        this.firstName = fn;
        this.lastName = ln;
        this.email = em;
        this.username = un;
        this.password = pw;
    }
}
