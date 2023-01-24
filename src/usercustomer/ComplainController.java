/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class ComplainController implements Initializable {
    
    @FXML    private TextField PhnNoTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField addressTextField;
    @FXML    private TextField productcatgTextField;
    @FXML    private TextField complainTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    void ReturnOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Market.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(ComplainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   @FXML
    private void appendBinaryFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            ComplainClass e = new ComplainClass(
            nameTextField.getText(),
            Integer.parseInt(PhnNoTextField.getText()),
            addressTextField.getText(),
            productcatgTextField.getText(),
            complainTextField.getText()  
            );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(ComplainController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ComplainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @FXML
    private void PhoneNumberTextFieldOnClick(MouseEvent event) {
        //idTextField.setText("");
        PhnNoTextField.clear();
    }

    @FXML
    private void nameTextFieldOnClick(MouseEvent event) {
        nameTextField.setText("");
    }

    @FXML
    private void AddressTextFieldOnClick(MouseEvent event) {
        addressTextField.setText("");
    }

    @FXML
    private void ProductCatgTextFieldOnClick(MouseEvent event) {
        productcatgTextField.setText("");
    }
    
     @FXML
    private void ComplainTextAreaOnClick(MouseEvent event) {
        complainTextField.setText("");
    }
     
    
}
