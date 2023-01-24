/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static usercustomer.MarketController.itemArr;

/**
 * FXML Controller class
 *
 * @author Syed Sowad Ephraim
 */
public class CartController implements Initializable {

    @FXML
    private TableView<Item> mytable;
    @FXML
    private TextArea msgtxt;
    int sum=0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        TableColumn name = new TableColumn("Name");
        TableColumn quantity = new TableColumn("Quantity");
        TableColumn price = new TableColumn("Price");
        
       
        mytable.getColumns().addAll(name, quantity, price);
        
        final ObservableList<Item> details = FXCollections.observableArrayList(itemArr);

        
        name.setCellValueFactory(new PropertyValueFactory<Item,String>("name"));
        
        quantity.setCellValueFactory(new PropertyValueFactory<Item,Integer>("quantity"));

        price.setCellValueFactory(new PropertyValueFactory<Item,Integer>("price")); 
            
           
         
        mytable.setItems(details);
        
        for(Item elem : itemArr){
           sum = sum + elem.price;
        }
        msgtxt.setText(Integer.toString(sum));
        
    }    

    @FXML
    private void returnonclick(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Market.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
