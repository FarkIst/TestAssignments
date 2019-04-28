/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.mariospizzabar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Farkas
 */
public class Order {
    private int id;
    private List<Pizza> pizzas;
    private int price;
    private int orderTime;
    
    public int getPrice(){
        return price;
    }
    
    public Order(int id, int orderTime){
        this.id = id;
        this.orderTime = orderTime;
        pizzas = new ArrayList();
    }
    
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
        price += pizza.getPrice();
    }
    
    public int getNumberOfPizzas(){
        return pizzas.size();
    }
    
    public void removePizza(Pizza pizza){
        for(int i = 0; i < pizzas.size(); i++){
            if(pizzas.get(i).getId() == pizza.getId()){
                price -= pizzas.get(i).getPrice();
                pizzas.remove(i);
            }
        }
    }
}
