/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ppodw
 */
public class AssetRepository {
    private HashMap<Integer, Asset> Assets;
    private ArrayList<Asset> NewAssets;

    public AssetRepository() {
        Assets = new HashMap();
        NewAssets = new ArrayList();
    }
    
    public Integer addNewAsset( Asset asset) {
        NewAssets.add(asset);
        return NewAssets.size();
    }
    
    public Asset getAsset( Integer id ) {
        return Assets.get(id);
    }
}
