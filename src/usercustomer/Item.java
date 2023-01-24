/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

/**
 *
 * @author Abdullah Matin
 */
public class Item {
    
    public String name;
    public int quantity;
    public int price;

    public Item(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    public void display(){
        System.out.println("Id="+price+", Name="+name+", Qiantity="+quantity);
    }
    
    public String toString(){
        return "Prodcut "+name+" "+quantity+" "+price;
    } 
}
