/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.testcases1;

import java.time.LocalTime;
/**
 *
 * @author Farkas
 */
public class trainscenario {
    public boolean isSaverTicket(String Time){
        if(!isRushHour(LocalTime.parse(Time))){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isRushHour(LocalTime t){
        if(t.isBefore(LocalTime.of(19, 30)) && t.isAfter(LocalTime.of(16, 0))){
            return true;
        }
        if(t.isBefore(LocalTime.of(9, 30)) && t.isAfter(LocalTime.of(5, 0))){
            return true;
        }
        else return false;
    }
}
