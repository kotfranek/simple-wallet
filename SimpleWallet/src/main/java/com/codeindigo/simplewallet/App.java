package com.codeindigo.simplewallet;

import com.codeindigo.simplewallet.model.InvestmentRepository;
import com.codeindigo.simplewallet.ui.WindowManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static WindowManager s_winMgr;
    private InvestmentRepository investment;

    @Override
    public void start(Stage stage) throws IOException {
        s_winMgr = new WindowManager(stage);
        s_winMgr.show(WindowManager.WINDOW.MAIN);
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