/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import basicStuff.LoginAccount;
import basicStuff.bikePart;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Jackson Trahan
 */
public class WareHouseFactory {
    public static Warehouse getWarehouse(String warehouseName, WarehouseTypes type) {
        if (type == WarehouseTypes.MAIN_WH) {
            return new MainWarehouse(warehouseName);
        } else {
            return new SalesVanWarehouse(warehouseName);
        }
    }
}

abstract class Warehouse {
    String filename;
    
    public abstract boolean addPart(bikePart bp, int c);
}

class MainWarehouse extends Warehouse {
    WarehouseInventory mWhDB;
    
    public MainWarehouse(String filename) {
        this.filename = filename;
        mWhDB = new WarehouseInventory();
        try {
            mWhDB.updateWareHouseDB(filename);
        } catch (FileNotFoundException e) {
            mWhDB.saveWarehouse(filename);
        }
    }
    
    @Override
    public boolean addPart(bikePart bp, int c) {
        mWhDB.addInventory(bp, c);
        mWhDB.saveWarehouse(this.filename);
        return true;
    }
}

class SalesVanWarehouse extends Warehouse {
    WarehouseInventory svWhDB;
    
    public SalesVanWarehouse(String filename) {
        this.filename = filename;
        svWhDB = new WarehouseInventory();
        try {
            svWhDB.updateWareHouseDB(filename);
        } catch (FileNotFoundException e) {
            svWhDB.saveWarehouse(filename);
        }
    }
        
    @Override
    public boolean addPart(bikePart bp, int c) {
        svWhDB.addInventory(bp, c);
        svWhDB.saveWarehouse(filename);
        return true;
    }
}
