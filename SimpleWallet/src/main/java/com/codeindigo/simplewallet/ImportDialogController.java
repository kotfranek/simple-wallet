/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.codeindigo.simplewallet;

import com.codeindigo.simplewallet.model.dataimport.OperationImport;
import com.codeindigo.simplewallet.ui.IWindowManager;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author ppodw
 */
public class ImportDialogController implements Initializable {

    
    @FXML
    private Button CancelButton;
    
    @FXML
    private Button ImportButton;
    
    @FXML
    private Button FileOpenButton;
    
    private FileChooser ImportFileChooser;
    
    @FXML
    private void showFileChooser(){
        Window me = App.getWndM().getStage(IWindowManager.WINDOW.IMPORT);
        File selectedFile = ImportFileChooser.showOpenDialog(me);
        
        if (selectedFile.canRead() && selectedFile.isFile())
        {
            OperationImport importer = new OperationImport();
            if ( importer.loadFromFile(OperationImport.SOURCE.EMAKLER, selectedFile)) {
                ImportButton.setDisable(false);
            }
        }
    }
    
    @FXML
    private void cancel() {
        App.getWndM().hide(IWindowManager.WINDOW.IMPORT);
    }
    
    @FXML
    private void importData() {
        
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ImportFileChooser = new FileChooser();
    }    
    
}
