/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.mariospizzabar;

import java.util.ArrayList;
import java.util.List;
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
public class OrderListTest {
    
    public OrderListTest() {
    }
    
    Order order1, order2;
    OrderList orderList;
    
    @Before
    public void setUp() {
        order1 = new Order(1, 12);
        order2 = new Order(2, 422);
        orderList = new OrderList();
        orderList.newOrder(order2);
    }
    
    @After
    public void tearDown() {
        order1 = null;
        order2 = null;
        orderList = null;
    }

    /**
     * Test of newOrder method, of class OrderList.
     */
    @Test
    public void testNewOrder() {
        System.out.println("newOrder");
        Order order = order1;
        OrderList instance = orderList;
        instance.newOrder(order);
    }

    /**
     * Test of orderSize method, of class OrderList.
     */
    @Test
    public void testOrderSize() {
        System.out.println("orderSize");
        OrderList instance = orderList;
        int expResult = 1;
        int result = instance.orderSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllOrders method, of class OrderList.
     */
    @Test
    public void testGetAllOrders() {
        System.out.println("getAllOrders");
        OrderList instance = orderList;
        List<Order> orders;
        orders = new ArrayList<>();
        orders.add(order2);
        int expResult = 1;
        int result = instance.getAllOrders().size();
        assertEquals(expResult, result);
    }
    
}
