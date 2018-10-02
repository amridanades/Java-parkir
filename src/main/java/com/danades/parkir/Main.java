/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danades.parkir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amri Danades
 */
public class Main {
    public static void main(String[] args) {
        
        boolean running = true;
        String answer = "n";
        
        while(running){
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(isr);

            Parkir p = new Parkir();
            try {
                System.out.print("Jenis Kendaraan : ");
                p.kendaraan = input.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            p.CekLot();
             System.out.println("----------------------------------------------------------------------");
            System.out.println("Apakah anda ingin keluar? ");
            System.out.print("[Y/N] : ");
            try {
                answer = input.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            if( answer.equalsIgnoreCase("Y") ){
                running = false;
            }
        }
    }
}
