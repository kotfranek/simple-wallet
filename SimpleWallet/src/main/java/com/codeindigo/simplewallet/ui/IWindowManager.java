/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeindigo.simplewallet.ui;

import javafx.stage.Stage;

/**
 *
 * @author ppodw
 */
public interface IWindowManager {
    
    enum WINDOW {
        MAIN, ABOUT, IMPORT, PREFERENCES
    }    

    Stage getStage(WINDOW scene);

    void show(WINDOW scene);
    void hide(WINDOW scene);
}
