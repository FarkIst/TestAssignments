/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.mariospizzabar;

/**
 *
 * @author Farkas
 */
public class Pizza {
    
    private int id, price;
    private String name;

    public Pizza(int id, int price, String name){
       this.id = id;
       this.price = price;
       this.name = name;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    
}
