/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.sistemas.operativos;

import java.util.*;

/**
 *
 * @author J-ALS
 */
public class Timer {
    
    public static void main(String[] args) {
        Timer timer =   new Timer();
        final TicTac tic    =   new TicTac(5);
        
        TimerTask task  =   new TimerTask() {
            @Override
            public void run() {
                
                if (tic.getValue()%2==0) {
                    System.out.println("TIC");
                } else {
                    System.out.println("TOC");
                    tic.increment();
                }
            }
          
        };
        
        }
    }
    

