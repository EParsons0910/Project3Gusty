/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicStuff;

/**
 *
 * @author jacksontrahan
 */
public class Person implements java.io.Serializable{
    String firstName = null;
    String lastName = null;
    public Person(String firstName, String lastName) {
        this.firstName = fn;
        this.lastName = ln;
    }
    
    public String getName() {return this.name;}
}
