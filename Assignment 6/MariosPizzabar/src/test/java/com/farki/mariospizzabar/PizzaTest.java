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
public class PizzaTest {
    
    public PizzaTest() {
    }
        Pizza pizza;
        Pizza pizza1;
    
    @Before
    public void setUp() {
        

        pizza = new Pizza(1, 32, "Some Pizza");
        pizza1 = new Pizza(2, 12, "Some other Pizza");
    }
    
    @After
    public void tearDown() {
        pizza = null;
        pizza1 = null;
    }

    /**
     * Test of getPrice method, of class Pizza.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Pizza instance = pizza;
        int expResult = 32;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Pizza.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 666;
        Pizza instance = pizza1;
        instance.setPrice(price);
        assertEquals(666, pizza1.getPrice());
    }

    /**
     * Test of getName method, of class Pizza.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Pizza instance = pizza;
        String expResult = "Some Pizza";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Pizza.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "PooPizza";
        Pizza instance = pizza1;
        instance.setName(name);
        assertEquals("PooPizza", pizza1.getName());
    }

    /**
     * Test of getId method, of class Pizza.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pizza instance = pizza;
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }
    
}
