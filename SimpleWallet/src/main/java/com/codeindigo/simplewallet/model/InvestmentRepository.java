/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model;

import java.util.ArrayList;

/**
 *
 * @author ppodw
 */
public class InvestmentRepository {

    private ArrayList<Wallet> Wallets;

    public InvestmentRepository() {
        this.Wallets = new ArrayList();
        Wallets.add(new Wallet("Akcje"));
        Wallets.add(new Wallet("Fundusze"));
        Wallets.add(new Wallet("Obligacje"));
        Wallets.add(new Wallet("Gotówka"));
    }
    
    
}
