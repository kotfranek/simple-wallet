/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeindigo.simplewallet.model.dataimport;

import com.codeindigo.simplewallet.model.Operation;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ppodw
 */
public interface IFileImport {
    public boolean process( File input, ArrayList<Operation> output );
}
