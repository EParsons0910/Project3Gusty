
package bike;

import basicStuff.LoginAccount;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

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
    
    public SysAdmin(String fn, String ln, String em, String un, String pw) throws Exception {
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
                    users.add(new OfficeMan(data[4], data[5], data[3], data[1], data[2]));
                    break;
                case "sales associate":
                    users.add(new SalesAssociate(data[4], data[5], data[3], data[1], data[2]));
                    break;
                case "warehouse manager":
                    users.add(new WarehouseManager(data[4], data[5], data[3], data[1], data[2]));
                    break;
            }
        }
        scnr.close();
    }
    
    
    public void addOfficeMan(String fn, String ln, String em, String un, String pw) throws Exception {
        users.add(new OfficeMan(fn, ln, em, un, pw));
        FileWriter fw = new FileWriter("users.txt", true);
        String s = "\nOffice Manager, " + fn + ", " + ln + ", " + em + ", " + un + ", " + pw;
        fw.append(s);
        fw.close();
    }
    public void addWHMan(String firstName, String lastName, String eMail, String un, String pw) throws Exception{
        users.add(new WarehouseManager(firstName, lastName, eMail, un, pw));
        FileWriter fw = new FileWriter("users.txt", true);
        String s = "\nWarehouse Manager, " + firstName + ", " + lastName + ", " + eMail + ", " + un + ", " + pw;
        fw.append(s);
        fw.close();
    }
    
    public void addSalesAssociate(String firstName, String lastName, String eMail, String userName, String passWord) throws Exception{
        users.add(new SalesAssociate(firstName, lastName, eMail, userName, passWord));
        FileWriter fw = new FileWriter("users.txt", true);
        String s = "\nSales Associate, " + firstName + ", " + lastName + ", " + eMail + ", " + userName + ", " + passWord;
        fw.append(s);
        fw.close();
    }
    
    public void addSalesVan() throws FileNotFoundException, UnsupportedEncodingException{
        System.out.println("Enter in a Sales Van name");
        Scanner scnr = new Scanner(System.in);
        String SalesVanName = scnr.nextLine();
        PrintWriter writer = new PrintWriter(SalesVanName, "UTF-8");
        writer.close();
    }
}