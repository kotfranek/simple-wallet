/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model.dataimport;

import com.codeindigo.simplewallet.model.Operation;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ppodw
 */
public class OperationImport {
    public enum SOURCE {
        EMAKLER,
        XTB,
        DEGIRO
    }
    
    public OperationImport() {
        
    }
    
    public boolean loadFromFile( SOURCE source, File fileName ) {
        boolean result = false;
        
        IFileImport fImport = new EmaklerImport();
        ArrayList<Operation> list = new ArrayList();
        
        result = fImport.process(fileName, list);
        
        return result;
    }
}
