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
public class OrderList {
    
    private ArrayList<Order> orders;
    
    public OrderList(){
        orders = new ArrayList();
    }
    
    public void newOrder(Order order){
        orders.add(order);
    }
    
    public int orderSize(){
        return orders.size();
    }
    
    public List<Order> getAllOrders(){
        return orders;
    }
}
