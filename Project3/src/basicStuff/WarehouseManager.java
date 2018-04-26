package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Jackson Trahan, Elizabeth Parsons
 */
public class WarehouseManager extends LoginAccount {
    String firstName;
    String lastName;
    String email;
    
    
    /*
    @param fn is first Name
    @param ln is Last Name
    @param em is eMail
    @param un is User Name
    @param pw is Password
    */
    public WarehouseManager(String fn, String ln, String em) {
        firstName = fn;
        lastName = ln;
        email = em;
    }
}