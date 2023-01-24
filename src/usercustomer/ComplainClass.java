/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.Serializable;

/**
 *
 * @author Abdullah Matin
 */
public class ComplainClass implements Serializable{
//public class Employee{Serializable
    public int PhnNo;
    public String name, Address, ProductCatg , Complain, ProductName;
    public int getPhnNo() {
        return PhnNo;
    }

    public void submitReport(){}
    public void setPhnNo(int PhnNo) {
        this.PhnNo = PhnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getProductCatg() {
        return ProductCatg;
    }

    public void setProductCatg(String ProductCatg) {
        this.ProductCatg = ProductCatg;
    }
    
     public String getComplain() {
        return Complain;
    }

    public void setComplain(String Complain) {
        this.Complain = Complain;
    }
    
    public ComplainClass( String name, int PhnNo, String Address, String ProductCatg, String Complain) {
        this.PhnNo = PhnNo;
        this.name = name;
        this.Address = Address;
        this.ProductCatg = ProductCatg;
        this.Complain= Complain;
        
    }

    public ComplainClass() {
    }

    @Override
    public String toString() {
            return "Name=" + name + "\n" + ", Phone Number=" + PhnNo  + "\n" + ", Address=" + Address  + "\n"+ ", ProductCategory=" + ProductCatg + "\n" + ", Complain=" + Complain+"\n\n";
    }
}
