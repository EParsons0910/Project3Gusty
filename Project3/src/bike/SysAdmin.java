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
import basicStuff.LoginAccount;
import basicStuff.Person;
import java.io.File;
import java.util.Scanner;
import java.io.Serializable;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SysAdmin extends LoginAccount{

    public static ArrayList<LoginAccount>users = new ArrayList<>();
    public void write(){
    Scanner scnr = new Scanner("users.txt");
    while(scnr.hasNextLine()){
        users.add(scnr.nextLine());
    }
    scnr.close();
}
    
    public SysAdmin(Person person, String userName, String passWord) {
        super(person, userName, passWord);
    }
    
    
    public void addOfficeMan(String firstName, String lastName, String eMail){
        Scanner scnr = new Scanner(System.in);
        File file = new File("users.txt");
        if (!file.equals(firstName) && !file.equals(lastName) && !file.equals(eMail)){
            
        }
        
        
    }
    public void addWHMan(String firstName, String lastName, String eMail){
        
    }
    
    public void addSalesAssociate(String firstName, String lastName, String eMail){
        
    }
}
