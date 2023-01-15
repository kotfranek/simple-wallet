package com.codeindigo.simplewallet;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TreeView;

public class ApplicationMainController {
    
    @FXML
    private TreeView tvInvestment;    

    @FXML
    private void switchToSecondary() throws IOException {
        App.showAbout();
    }
    
    @FXML
    private void showPreferences(){
        App.showPreferences();
    }
    
    @FXML
    private void closeApp() {
        Platform.exit();
    }
}
