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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class CustomerServiceManagerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    void CheckComplaintsOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CheckForComplaints.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void RequestStocksOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("RequestStocks.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    void RequestForFaultyOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("RequestForFaulty.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    void RecordFilesOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("RecordFiles.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void TrainStaffOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("TrainStaff.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    void DevAndRepOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("DevAndRep.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void DailyReportssOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("DailyReports.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void ReturnOnClick(ActionEvent event) {
        
         try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
