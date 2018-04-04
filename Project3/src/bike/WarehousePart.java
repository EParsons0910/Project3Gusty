/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import basicStuff.bikePart;
import java.util.Comparator;

/**
 *
 * @author Elizabeth Parsons
 */
public class WarehousePart {
    private bikePart bp;
    private int count;
    
    public static Comparator<WarehousePart>SORT_BY_NAME = new Comparator<WarehousePart>() {
        @Override
        public int compare(final WarehousePart o1, final WarehousePart o2) {
            String o1Name = o1.getBp().getName() + o1.getBp().getName();
            String o2Name = o2.getBp().getName() + o2.getBp().getName();
            return o1Name.compareTo(o2Name);
        }
    };
    
    public static Comparator<WarehousePart>SORT_BY_NUMBER = (WarehousePart o1, WarehousePart o2) -> (Integer.compare(o1.getBp().getNumber(), o2.getBp().getNumber()));
    
    
    WarehousePart(bikePart bp, int count){
        this.bp = bp;
        this.count = count;
    }
    
    public bikePart getBp(){
        return bp;
    }
    
    public int getCount(){
        return count;
    }
    
    public void setBp(bikePart bp){
        this.bp = bp;
    }
    
    public void setCount(int count){
        this.count = count;
    }
}
