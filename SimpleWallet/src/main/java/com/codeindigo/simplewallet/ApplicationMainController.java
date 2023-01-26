package com.codeindigo.simplewallet;

import com.codeindigo.simplewallet.model.Asset;
import com.codeindigo.simplewallet.model.Wallet;
import com.codeindigo.simplewallet.ui.IWindowManager;
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
    private void showImportDialog() {
        App.getWndM().show(IWindowManager.WINDOW.IMPORT);
    }
    
    @FXML
    private void closeApp() {
        Platform.exit();
    }
    
    private void populateWallet( TreeItem root, Wallet wallet ) {
        ArrayList<Asset> assets = wallet.getAssets();
        TreeItem tiWallet = new TreeItem(wallet.getName());
        root.getChildren().add(tiWallet);

        assets.forEach(
                asset -> { 
                    TreeItem tiAsset = new TreeItem(asset.getName());
                    tiWallet.getChildren().add(tiAsset);
                }
        );        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if ( null != tvInvestment )
        {
            TreeItem rootItem = new TreeItem("Przemek");
            ArrayList<Wallet> wallets = App.getInvestRepo().getWallets();
            
            wallets.forEach(
                    wallet -> { populateWallet( rootItem, wallet ); }
            );
            tvInvestment.setRoot(rootItem);
        }          
    }
      
}
