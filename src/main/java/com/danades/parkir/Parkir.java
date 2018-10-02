/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danades.parkir;

/**
 *
 * @author Amri Danades
 */
public class Parkir {
    
    String kendaraan;              //variabel kendaraan
    String[] area = {              // variabel area
        "- Area parkir motor",
        "- Area parkir mobil",
        "- Area parkir bus"
    };
    
    void CekLot(){   //method ngecek lot yang tersedia
        System.out.println("\nLot parkir yang diperbolehkan :");
        if (kendaraan.equalsIgnoreCase("motor"))
             System.out.printf(area[0]+ "\n" + area[1] + "\n" + area[2] + "\n");
        else if (kendaraan.equalsIgnoreCase("mobil"))
            System.out.printf(area[1]+ "\n" + area[2] + "\n");
        else if (kendaraan.equalsIgnoreCase("bus"))
            System.out.printf(area[2] + "\n");
        else System.out.printf("Kendaraan tidak sesuai \n");
    }
}
