package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Elizabeth Parsons
 */
public class SalesAssociate extends LoginAccount {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    
    SalesAssociate(String fn, String ln, String em, String un, String pw){
        this.firstName = fn;
        this.lastName = ln;
        this.email = em;
        this.username = un;
        this.password = pw;
    }
}
