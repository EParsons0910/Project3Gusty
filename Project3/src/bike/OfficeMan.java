package bike;

import basicStuff.LoginAccount;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class OfficeMan extends LoginAccount {
    private String fn; 
    private String ln;
    private String em;
    private String un;
    private String pw;
    
    public OfficeMan(String fn, String ln, String em, String un, String pw){
        this.fn = fn;
        this.ln = ln;
        this.em = em;
        this.un = un;
        this.pw = pw;
    }
}
