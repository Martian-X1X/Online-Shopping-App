/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercustomer;

import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class DailyReportsController implements Initializable {
    
    @FXML    private TextArea InputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void appendTextFileButtonOnClick(ActionEvent event) {       
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        //fw = new FileWriter("abc.txt");
        try {         
            f = new File("DailyReports.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	InputTextArea.getText()+"\n"	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @FXML
    void ReturnOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerServiceManager.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(DailyReportsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
