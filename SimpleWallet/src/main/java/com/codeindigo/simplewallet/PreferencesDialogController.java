/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.codeindigo.simplewallet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author ppodw
 */
public class PreferencesDialogController implements Initializable {

    @FXML
    private TreeView tvPreferences;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if ( null != tvPreferences )
        {
            TreeItem rootItem = new TreeItem("Preferences");
            rootItem.getChildren().add(new TreeItem("Tickers"));
            rootItem.getChildren().add(new TreeItem("Stock"));
            rootItem.getChildren().add(new TreeItem("Database"));
            tvPreferences.setRoot(rootItem);
        }
    }    
    
}
