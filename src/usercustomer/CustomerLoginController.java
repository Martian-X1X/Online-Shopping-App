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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static usercustomer.RegisterController.logArr;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class CustomerLoginController implements Initializable {
    
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    void LoginOnAction(ActionEvent event)throws IOException {
        
        String y1 = username.getText();
        String y2 = password.getText();
        
        if(y1.equals("Arman") && y2.equals("001")){
            switchtoItem(event);
        }
        else if(y1.equals("Matin") && y2.equals("002")){
             switchtoItem(event);
        }
        else{
            for (Mem element : logArr){
                    if (element.name.equals(y1)){
                        if(element.password.equals(y2)){
                            switchtoItem(event);
                        }
                    }
         
            }
        }
    }
    
    public void switchtoItem(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Market.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
     @FXML
    void registeronclick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    void CustomerServiceManagerOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerServiceManager.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
