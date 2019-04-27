/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.testcases1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Farkas
 */
public class whiteboxtestingTest {
    
    whiteboxtesting wbt;
    
    public whiteboxtestingTest() {
        
    }
        
    @Before
    public void setUp() {
        wbt = new whiteboxtesting();
    }
    
    @After
    public void tearDown() {
        wbt = null;
    }

    @Test
    public void noNumbers(){
        String[] args = new String[0];
        assertEquals("No numbers", wbt.MinMax(args));
    }
    
    @Test
    public void atLeastOneNumber(){
        String[] args = new String[1];
        args[0] = "17";
        assertEquals("Minimum = 17; maximum = 17", wbt.MinMax(args));
    }
    
    
    @Test 
    public void exactlyTwoNumbers(){
        String[] args = new String[2];
        args[0] = "27";
        args[1] = "29";
        assertEquals("Minimum = 27; maximum = 29", wbt.MinMax(args));
    }
    
    
}
