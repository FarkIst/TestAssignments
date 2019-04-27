/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.testcases1;

import java.time.LocalTime;
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
public class trainscenarioTest {
    
    trainscenario ts;

    
    @Before
    public void setUp() {
        ts = new trainscenario();
    }
    
    @After
    public void tearDown() {
        ts = null;
    }

    @Test
    public void isSaverTicket(){
        assertEquals(true, ts.isSaverTicket("12:30"));
    }
    
    @Test
    public void isNotSaverTicket(){
        assertEquals(false, ts.isSaverTicket("16:20"));
    }
    
    @Test
    public void isRushHour(){
        assertEquals(true, ts.isRushHour(LocalTime.of(9, 0)));
    }
}
