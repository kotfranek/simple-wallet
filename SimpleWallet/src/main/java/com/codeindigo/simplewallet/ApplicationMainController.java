package com.codeindigo.simplewallet;

import com.codeindigo.simplewallet.model.Wallet;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ApplicationMainController  implements Initializable {
    
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if ( null != tvInvestment )
        {
            TreeItem rootItem = new TreeItem("User");
            ArrayList<Wallet> wallets = App.getInvestRepo().getWallets();
            
            wallets.forEach(
                    wallet -> { 
                        rootItem.getChildren().add(new TreeItem(wallet.getName()));
                                }
            );
            tvInvestment.setRoot(rootItem);
        }          
    }
      
}
