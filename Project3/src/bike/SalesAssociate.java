package bike;

import basicStuff.LoginAccount;
import bike.WareHouseFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Elizabeth Parsons, Jackson Trahan
 */
public class SalesAssociate extends LoginAccount {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    Warehouse warehouse;
    
    public SalesAssociate(String fn, String ln, String em, String un, String pw){
        firstName = fn;
        lastName = ln;
        email = em;
        username = un;
        password = pw;
    }
    
    public void addWarehouse(String name) {
        warehouse = WareHouseFactory.getWarehouse(name, WarehouseTypes.SALESVAN_WH);
    }
    
    public void loadSalesVan(String salesVanName, String transferFileName) throws FileNotFoundException{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter in a sales Van name:");
        salesVanName = scnr.nextLine();
        System.out.println("Loading Sales Van " + salesVanName);
        File file = new File(salesVanName);
        if (!file.exists()){
            System.out.println("Sales Van does not exist");
        }
        else{
            System.out.println("Enter in transfer file Name");
            transferFileName = scnr.nextLine();
            File transferFile = new File(transferFileName);
            if(!transferFile.exists()){
                System.out.println("Transfer File does not exist.");
            }
            else{
                Scanner sc = new Scanner(file);
                PrintWriter print = new PrintWriter(transferFile);
                while(sc.hasNextLine()){
                    String s = sc.nextLine();
                    print.write(s);
                }
            }
        }
        
    }
}