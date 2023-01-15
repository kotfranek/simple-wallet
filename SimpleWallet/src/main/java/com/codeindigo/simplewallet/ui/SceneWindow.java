/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.ui;

import com.codeindigo.simplewallet.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ppodw
 */
public class SceneWindow {
    private Stage m_stage;
    
    private void initWindow( String fXml, String name, boolean modal, boolean dialog ) {
        if ( null != m_stage ) {
            try {
                Scene scene = new Scene(loadFXML(fXml));
                m_stage.setScene(scene);
                m_stage.setTitle(name);
                
                if (dialog)
                {
                    m_stage.setResizable( false );                                    
                    m_stage.initStyle(StageStyle.UTILITY);
                }
                
                if (modal)
                {
                    m_stage.initModality(Modality.WINDOW_MODAL);
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    
    public SceneWindow( String fXml, String name, Stage root ) {
        m_stage = root;        
        initWindow(fXml, name, false, false);
    }
    
    public SceneWindow( String fXml, String name, boolean modal, boolean dialog ) {
        m_stage = new Stage();            
        initWindow(fXml, name, modal, dialog);        
    }
    
    public void show() {
        if ( null != m_stage ) {
            m_stage.show();
        }
    }
    
    public void close() {
        if ( null != m_stage ) {        
            m_stage.close();
        }
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }      
}
