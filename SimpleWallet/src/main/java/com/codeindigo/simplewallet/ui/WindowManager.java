/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.ui;

import java.util.HashMap;
import javafx.stage.Stage;

/**
 *
 * @author ppodw
 */
public class WindowManager implements IWindowManager {
    
    private Stage m_rootStage;
    private HashMap<WINDOW, SceneWindow> m_windows;
        
    public WindowManager( Stage rootStage )
    {
        m_rootStage = rootStage;
        m_windows = new HashMap<>();
        
        loadStages();
    }
      
    private void loadStages()
    {
        m_windows.put(WINDOW.MAIN, new SceneWindow("MainWindow", "SimpleWallet", m_rootStage));
        m_windows.put(WINDOW.ABOUT, new SceneWindow( "AboutDialog", "About", false, true));
        m_windows.put(WINDOW.PREFERENCES, new SceneWindow( "PreferencesDialog", "Preferences", false, true));
        m_windows.put(WINDOW.IMPORT, new SceneWindow( "ImportDialog", "Import Data", false, true));
    }
    
    private SceneWindow getScene( WINDOW scene )
    {
        return m_windows.get(scene);
    }    
    
    @Override
    public Stage getStage(WINDOW scene) {
        return m_windows.get(scene).getStage();
    }    
    
    @Override
    public void show( WINDOW scene ) {
        SceneWindow window = getScene(scene);
        if (null != window)
        {
            window.show();
        }
    }

    @Override
    public void hide(WINDOW scene) {
        SceneWindow window = getScene(scene);
        if (null != window)
        {
            window.close();
        }        
    }

    
}
