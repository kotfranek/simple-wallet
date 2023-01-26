/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model;

/**
 *
 * @author ppodw
 */
public class Asset implements IAsset {    
    private final IAsset.TYPE Type;
    private final String Currency;
    private final String Ticker;
    private final String Name;

    @Override
    public String getCurrency() {
        return Currency;
    }
    
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public TYPE getType() {
        return Type;
    }

    public Asset(TYPE Type, String Currency, String Ticker, String Name) {
        this.Type = Type;
        this.Currency = Currency;
        this.Ticker = Ticker;
        this.Name = Name;
    }        
}
