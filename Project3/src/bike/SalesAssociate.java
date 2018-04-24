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
        firstName = fn;
        lastName = ln;
        email = em;
        username = un;
        password = pw;
    }
}
