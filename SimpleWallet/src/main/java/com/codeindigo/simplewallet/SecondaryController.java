package com.codeindigo.simplewallet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SecondaryController implements Initializable {
    
    @FXML
    private Button buttonOk;
    @FXML
    private Label labelVersion;   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelVersion.setText("0.1");
    } 
    
    @FXML
    private void closeDialog() throws IOException {
        Stage stage = (Stage) buttonOk.getScene().getWindow();
        stage.close();
    }
}