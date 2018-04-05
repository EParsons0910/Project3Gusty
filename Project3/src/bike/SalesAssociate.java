/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import basicStuff.bikePart;

/**
 *
 * @author Elizabeth Parsons
 */
public class SalesAssociate{
    private bikePart bp;
    private int count;
    
    
    SalesAssociate(bikePart bp, int count){
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
    public void addPart(bikePart bp, int count){
     
    }
}
