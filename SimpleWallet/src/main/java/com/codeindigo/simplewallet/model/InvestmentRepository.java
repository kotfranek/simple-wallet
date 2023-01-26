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
    private AssetRepository Assets;
    
    private void initAll() {
        Wallet cashPillow = new Wallet("Poduszka");        
        Asset cash = new Asset(Asset.TYPE.CASH, "PLN", null, "Gotówka");
        this.Assets.addNewAsset(cash);
        cashPillow.addAsset(cash);
        Wallets.add(new Wallet("Akcje"));
        Wallets.add(new Wallet("Fundusze"));
        Wallets.add(new Wallet("Obligacje"));
        Wallets.add(cashPillow);
    }

    public InvestmentRepository() {
        this.Wallets = new ArrayList();
        this.Assets = new AssetRepository();
        
        initAll();
    }

    public ArrayList<Wallet> getWallets() {
        return Wallets;
    }
    
    
}
