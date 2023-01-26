/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeindigo.simplewallet.model;

/**
 *
 * @author ppodw
 */
public interface IAsset {
        public enum TYPE {
        SHARES,
        BONDS,
        CASH,
        FUND_INV,
        FUND_ETF,
        ESTATE,
    }
        
    /**
     *
     * @return
     */
    public String getCurrency();
    
    public String getName();

    public TYPE getType();
}
