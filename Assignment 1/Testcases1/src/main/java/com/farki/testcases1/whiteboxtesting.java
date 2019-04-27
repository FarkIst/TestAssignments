/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farki.testcases1;

/**
 *
 * @author Farkas
 */
public class whiteboxtesting {
        public String MinMax(String[] args) {
        int mi, ma, obs;
        if (args.length == 0) {
            return "No numbers";
        } else {
            mi = ma = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) {
                obs = Integer.parseInt(args[i]);
                if (obs > ma) {
                    ma = obs;
                }
                // original :  mi < obs
                else if (obs < mi) {
                    mi = obs;
                }
            }
            return ("Minimum = " + mi + "; maximum = " + ma);
        }
    }
}
