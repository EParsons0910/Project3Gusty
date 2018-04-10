/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicStuff;

/**
 *
 * @author jacksontrahan Elizabeth Parsons
 */
public class LoginAccount {
    Person p = null;
    
    public boolean validate(String un, String pw) {
        if (un != null && pw != null){
            return true;
        }
        else{
            return false;
        }
    }
}
