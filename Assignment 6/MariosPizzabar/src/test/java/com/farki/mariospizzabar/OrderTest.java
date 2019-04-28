/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.mariospizzabar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Farkas
 */
public class OrderTest {
    
    public OrderTest() {
    }
    Order order;
    Order order2;
    Pizza pizza;
    Pizza pizza1;
    Pizza pizza2;
    
    @Before
    public void setUp() {
        order = new Order(1, 12);
        order2 = new Order(2, 42);
        pizza = new Pizza(2, 420, "Piiiiz");
        pizza1 = new Pizza(3, 12, "Some other Pizza");
        pizza2 = new Pizza(4, 55, "Piiiieezza");
        
        order.addPizza(pizza);
        order.addPizza(pizza1);
        order2.addPizza(pizza2);
    }
    
    @After
    public void tearDown() {
        order = null;
        order2 = null;
        pizza = null;
        pizza2 = null;
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Order instance = order;
        int expResult = 432;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPizza method, of class Order.
     */
    @Test
    public void testAddPizza() {
        System.out.println("addPizza");
        Pizza pizza = pizza2;
        Order instance = order2;
        instance.addPizza(pizza);
    }

    /**
     * Test of getNumberOfPizzas method, of class Order.
     */
    @Test
    public void testGetNumberOfPizzas() {
        System.out.println("getNumberOfPizzas");
        Order instance = order;
        int expResult = 2;
        int result = instance.getNumberOfPizzas();
        assertEquals(expResult, result);
    }

    /**
     * Test of removePizza method, of class Order.
     */
    @Test
    public void testRemovePizza() {
        System.out.println("removePizza");
        Pizza pizza = pizza2;
        Order instance = order2;
        instance.removePizza(pizza);
    }
    
}
