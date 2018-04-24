package bike;

import basicStuff.LoginAccount;
import basicStuff.Person;
import java.io.File;
import java.util.Scanner;
import java.io.Serializable;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Elizabeth Parsons
 */
public class SysAdmin extends LoginAccount{

    public static ArrayList<LoginAccount> users = new ArrayList<>();
    
    public void write() throws Exception {
        Scanner scnr = new Scanner(new File("users.txt"));
        while(scnr.hasNextLine()){
            String[] data = scnr.nextLine().split(", ");
            switch (data[2].toLowerCase()) {
                case "office manager":
                    users.add(new OfficeMan(data[1], data[2], data[3], data[4], data[5]));
                    break;
            }
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
