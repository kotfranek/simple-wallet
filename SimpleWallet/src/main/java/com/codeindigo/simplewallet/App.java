package com.codeindigo.simplewallet;

import com.codeindigo.simplewallet.model.InvestmentRepository;
import com.codeindigo.simplewallet.model.dataimport.OperationImport;
import com.codeindigo.simplewallet.ui.IWindowManager;
import com.codeindigo.simplewallet.ui.WindowManager;
import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static WindowManager s_winMgr;
    private static InvestmentRepository s_Investment;

    @Override
    public void start(Stage stage) throws IOException {
        OperationImport importer = new OperationImport();
        importer.loadFromFile(OperationImport.SOURCE.EMAKLER, new File("C:\\Users\\ppodw\\OneDrive\\Documents\\NetBeansProjects\\simple-wallet\\SimpleWallet\\inputs\\emakler-transakcje.csv"));
        s_Investment = new InvestmentRepository();
        
        s_winMgr = new WindowManager(stage);
        s_winMgr.show(WindowManager.WINDOW.MAIN);
    }
    
    public static InvestmentRepository getInvestRepo() {
        return s_Investment;
    }
    
    public static IWindowManager getWndM() {
        return s_winMgr;
    }
    
    public static void showAbout()
    {
        s_winMgr.show(WindowManager.WINDOW.ABOUT);
    }
    
    public static void showPreferences()
    {
        s_winMgr.show(WindowManager.WINDOW.PREFERENCES);
    }

    public static void main(String[] args) {
        launch();
    }

}