/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model.dataimport;

import com.codeindigo.simplewallet.model.Operation;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ppodw
 */
public class EmaklerImport implements IFileImport {
    
    private static final int MIN_LENGTH = 30;
    private static final String MBANK_REGEXP = "^(\\d{2}[.]{1}){2}\\d{4}\\s(\\d{2}[:;]){3}";
    
    private boolean checkLine( String line ) {
        boolean result = false;
        if (null != line && line.length() >= MIN_LENGTH) {
            result = line.matches(MBANK_REGEXP);
        }
            
        return result;
    }

    private List<String> parseLine( String line ) {
        List<String> values = new ArrayList<String>();
        
        if ( checkLine(line) ) {
            try (Scanner rowScanner = new Scanner(line)) {
                rowScanner.useDelimiter(";");
                while (rowScanner.hasNext()) {
                    values.add(rowScanner.next());
                    }
            }
        }
        return values;            
    }
    
    private boolean parseFile( File input, ArrayList<Operation> output ) {
        boolean result = true;
        
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(input, StandardCharsets.ISO_8859_1);) {
            String line = null;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                records.add(parseLine(line));
            }
        }
        catch ( Exception e ) {
            result = false;
        }
        
        return result;
    }
    
    @Override
    public boolean process(File input, ArrayList<Operation> output) {
        boolean result = false;
        
        if ( input != null && output != null )
        {
            if ( input.exists() && input.canRead() )
            {
                result = parseFile(input, output);
            }
        }
        
        return result;
    }
    
}
