/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class MarketController implements Initializable {
    
    @FXML
    private ImageView Hoodies;

    @FXML
    private ImageView belts;

    @FXML
    private ImageView perfume;

    @FXML
    private ImageView tshirt;

    @FXML
    private ImageView watches;
    
    @FXML
    private TextArea iteminfo;
    public static ArrayList<Item> itemArr = new ArrayList<Item>();
    static int a=0, b=0, c=0, d=0, e=0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         watches.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> {
       iteminfo.setText("Item Name: Watch" + "\n" + "Item type: Accessories" + "\n" + "Item Price: 3500");
       });
       
       belts.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> {
       iteminfo.setText("Item Name: Belt" + "\n" + "Item type: Accessories" + "\n" + "Item Price: 700");
       });
       
       perfume.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> {
       iteminfo.setText("Item Name: Perfume" + "\n" + "Item type: Fragnances" + "\n" + "Item Price: 2000");
       });
       
       tshirt.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> {
       iteminfo.setText("Item Name: Perfume" + "\n" + "Item type: Clothing" + "\n" + "Item Price: 500");
       });
       
       Hoodies.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> {
       iteminfo.setText("Item Name: Hoodies" + "\n" + "Item type: Clothing" + "\n" + "Item Price: 1200");
       });
       
        // TODO
    }  
    
    
    @FXML
    void addtocart1(ActionEvent event) {
        
         if (a==0){
            a++;
            itemArr.add(new Item("Hoodie", a, 1200));
         }
         else{
            a++;
            for(Item elem : itemArr) {
               if(elem!=null && "Hoodie".equals(elem.getName())) {
                elem.setQuantity(a);
                int sum = elem.getPrice() + 1200;
                elem.setPrice(sum);
                break;
               }
            }
         }    
    }
    
    @FXML
    void addtocart2(ActionEvent event) {
        
         if (b==0){
            b++;
            itemArr.add(new Item("Perfume", b, 2000));
         }
         else{
            b++;
            for(Item elem : itemArr) {
               if(elem!=null && "Perfume".equals(elem.getName())) {
                elem.setQuantity(b);
                int sum = elem.getPrice() + 2000;
                elem.setPrice(sum);
                break;
               }
            }
         }    
    }
    
    @FXML
    void addtocart3(ActionEvent event) {
        
         if (c==0){
            c++;
            itemArr.add(new Item("Tshirt", c, 500));
         }
         else{
            c++;
            for(Item elem : itemArr) {
               if(elem!=null && "Tshirt".equals(elem.getName())) {
                elem.setQuantity(c);
                int sum = elem.getPrice() + 500;
                elem.setPrice(sum);
                break;
               }
            }
         }    
    }
    
    @FXML
    void addtocart4(ActionEvent event) {
        
         if (d==0){
            d++;
            itemArr.add(new Item("Watch", d, 3500));
         }
         else{
            d++;
            for(Item elem : itemArr) {
               if(elem!=null && "Watch".equals(elem.getName())) {
                elem.setQuantity(d);
                int sum = elem.getPrice() + 3500;
                elem.setPrice(sum);
                break;
               }
            }
         }    
    }
    
    @FXML
    void addtocart5(ActionEvent event) {
        
         if (e==0){
            e++;
            itemArr.add(new Item("Belt", e, 700));
         }
         else{
            e++;
            for(Item elem : itemArr) {
               if(elem!=null && "Belt".equals(elem.getName())) {
                elem.setQuantity(e);
                int sum = elem.getPrice() + 700;
                elem.setPrice(sum);
                break;
               }
            }
         }    
    }
    
    @FXML
    void checkcart(ActionEvent event) {
        
        /*for (Item element : itemArr){
            System.out.println(element);
        }*/
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(MarketController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void ComplainOnAction(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Complain.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void RestockOnAction(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Restock.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void ExchangeOnAction(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Exchange.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void LogoutOnClick(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
