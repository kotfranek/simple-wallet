/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeindigo.simplewallet.model;

import java.time.Instant;

/**
 *
 * @author ppodw
 */
public class Operation {
    public enum TYPE {
        BUY,
        SELL
    }
    
    private int Amount;
    private Instant Time;
    private double Commission;
}
