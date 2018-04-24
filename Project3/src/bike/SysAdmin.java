package bike;

import basicStuff.LoginAccount;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class SysAdmin extends LoginAccount {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    ArrayList<LoginAccount> users = new ArrayList<>();
    
    public SysAdmin(String fn, String ln, String em, String un, String pw) {
        firstName = fn;
        lastName = ln;
        email = em;
        username = un;
        password = pw;
        
        try {
            getUsers();
        } catch (Exception e) {
            System.out.println("ERROR: Couldnt open \"users.txt\"");
            users = new ArrayList();
        }
    }
    
    public void getUsers() throws Exception {
        Scanner scnr = new Scanner(new File("users.txt"));
        while(scnr.hasNextLine()){
            String[] data = scnr.nextLine().split(", ");
            switch (data[2].toLowerCase()) {
                case "office manager":
                    users.add(new OfficeMan(data[1], data[2], data[3], data[4], data[5]));
                    break;
                case "sales associate":
                    users.add(new SalesAssociate(data[1], data[2], data[3], data[4], data[5]));
                    break;
                case "warehouse manager":
                    users.add(new WarehouseManager(data[1], data[2], data[3], data[4], data[5]));
                    break;
            }
        }
        scnr.close();
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
