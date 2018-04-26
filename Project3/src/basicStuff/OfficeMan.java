package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class OfficeMan extends LoginAccount{
    private String fn; 
    private String ln;
    private String em;

    
    /**
     *
     * @param fn is first name of office manager
     * @param ln is last name of office manager
     * @param em is email of office manager
     * @param un is username of office manager
     * @param pw is password of office manager
     */
    public OfficeMan(String fn, String ln, String em){
        this.fn = fn;
        this.ln = ln;
        this.em = em;
        
    }
    
}