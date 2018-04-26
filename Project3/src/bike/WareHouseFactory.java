/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import basicStuff.LoginAccount;
import basicStuff.bikePart;
import java.io.FileNotFoundException;

/**
 *
 * @author Jackson Trahan
 */
public class WarehouseFactory {
    public static Warehouse getWarehouse(LoginAccount la) {
        if (OfficeMan.class.isInstance(la)) {
            return new MainWarehouse();
        } else if (SalesAssociate.class.isInstance(la)) {
            return new SalesVanWarehouse(la.username + la.password);
        } else if (WarehouseManager.class.isInstance(la)) {
            return new MainWarehouse();
        }
        return null;
    }
}

abstract class Warehouse {
    String filename;
    public WarehouseInventory whDb;
    
    public void addPart(bikePart bp, int c) {
        whDb.addInventory(bp, c);
        whDb.saveWarehouse(filename);
    }
}

class MainWarehouse extends Warehouse {
    public MainWarehouse() {
        this.filename = "MainWH.txt";
        whDb = new WarehouseInventory();
        try {
            whDb.updateWareHouseDB(filename);
        } catch (FileNotFoundException e) {
            whDb.saveWarehouse(filename);
        }
    }
}

class SalesVanWarehouse extends Warehouse {
    public SalesVanWarehouse(String filename) {
        this.filename = filename;
        whDb = new WarehouseInventory();
        try {
            whDb.updateWareHouseDB(filename);
        } catch (FileNotFoundException e) {
            whDb.saveWarehouse(filename);
        }
    }
}
