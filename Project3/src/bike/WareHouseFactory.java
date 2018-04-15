/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import basicStuff.bikePart;

/**
 *
 * @author Jackson Trahan
 */
public class WareHouseFactory {
    public Warehouse getWarehouse(String warehouseName) {
        return new MainWarehouse();
    }
}

abstract class Warehouse {
    public abstract boolean addPart(bikePart bp, int c);
}

class MainWarehouse extends Warehouse {
    WarehouseInventory mWhDB;
    
    @Override
    public boolean addPart(bikePart bp, int c) {
        mWhDB.addInventory(bp, c);
        return true;
    }
}

class SalesVanWarehouse extends Warehouse {
    WarehouseInventory svWhDB;
    
    @Override
    public boolean addPart(bikePart bp, int c) {
        svWhDB.addInventory(bp, c);
        return true;
    }
}
