/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.time.LocalDate;

/**
 *
 * @author Abdullah Matin
 */
public class CustomerRecords {
    public int CusId, CusPhn;
    public String CusName;
    public LocalDate PurchaseDate;

    public CustomerRecords() {
    }

    public CustomerRecords(int CusId, String CusName, int CusPhn, LocalDate PurchaseDate) {
        this.CusId = CusId;
        this.CusName = CusName;
        this.CusPhn = CusPhn;
        this.PurchaseDate = PurchaseDate;
        
    }

    public int getId() {
        return CusId;
    }

    public void setId(int CusId) {
        this.CusId = CusId;
    }

    public String getName() {
        return CusName;
    }

    public void setName(String CusName) {
        this.CusName = CusName;
    }

    public int getPhNum() {
        return CusPhn;
    }

    public void setPhNum(int CusPhn) {
        this.CusPhn = CusPhn;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(LocalDate PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

   

    @Override
    public String toString() {
        return "Customer Id=" + CusId + "\n " + "Customer Name=" + CusName + "\n " + "PhoneNumber=" + CusPhn + "\n " + "Date Of Purchase=" + PurchaseDate+"\n\n\n";
    }
}
   
    

