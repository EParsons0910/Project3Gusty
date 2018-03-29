/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicStuff;

/**
 *
 * @author Elizabeth Parsons
 */
public class bikePart {
   private String name;
   private int number;
   private double price;
   private double salesPrice;
   private boolean onSale;
   private int quantity;
   /**@param name is part name.
      @param number is part number
      @param price is part price
      @param salesPrice is the price of the part on sale
      @param onSale indicates whether the part is on sale
   */
   
   public bikePart(String name, int number, double price, double salesPrice, boolean onSale, int quantity){
      this.name = name;
      this.number = number;
      this.price = price;
      this.salesPrice = salesPrice;
      this.onSale = onSale;
      this.quantity = quantity;
      }
   
   public String getName()
     {return name;}
   
   public int getNumber(){
       return number;
   }
   
   public double getPrice(){
       return price;
   }
   
   public double getSalesPrice(){
       return salesPrice;
   }
   
   public boolean getOnSale(){
       return onSale;
   }
   
   public int getQuantity(){
       return quantity;
   }
   
   public void setName(String name){
       this.name = name;
   }
   
   public void setNumber(int number){
       this.number = number;
   }
   
   public void setPrice(double price){
       this.price = price;
   }
   
   public void setSalesPrice(double salesPrice){
       this.salesPrice = salesPrice;
   }
   
   public void setOnSale(boolean onSale){
       this.onSale = onSale;
   }
   
   public void setQuantity(int quantity){
       this.quantity = quantity;
   }
}
