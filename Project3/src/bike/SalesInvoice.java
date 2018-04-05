/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

/**
 *
 * @author Elizabeth Parsons
 */
import java.util.Date;

public class SalesInvoice {
    private Date dateOfSale;
    
    SalesInvoice(Date dateOfSale){
        this.dateOfSale = dateOfSale;
    }
    
    public Date getDateOfSale(){
        return dateOfSale;
    }
    
}
