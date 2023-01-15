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
public class Wallet {
    private String Name;
    private ArrayList<Asset> Assets;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList getAssets() {
        return Assets;
    }

    public void addAsset(Asset item) {
        this.Assets.add(item);
    }
    
    public Wallet(String Name) {
        this.Name = Name;
        this.Assets = new ArrayList();
    }
       
}
