/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class CheckForComplaintsController implements Initializable {
    
    @FXML    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void LogoutOnClick(ActionEvent event) {
        
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerServiceManager.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CheckForComplaintsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void readBinaryFileButtonOnClick(ActionEvent event) {
        outputTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("EmpObjects.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ComplainClass emp;
            try{
                outputTextArea.setText("");
                while(true){
                    System.out.println("Printing objects.");
                    emp = (ComplainClass)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    emp.submitReport();
                    System.out.println(emp.toString());
                    outputTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
    
  }
}
