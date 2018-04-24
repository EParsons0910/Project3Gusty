package bike;

import basicStuff.LoginAccount;
import bike.WareHouseFactory;

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
}
