package com.restaklendifa.praktikumpbo.pertemuan4.kendaraan;

public class Truk extends Kendaraan {//Child class dari Kendaraan
    int maxGear;
    String color;
    public void belok(String arah){
        System.out.println("Truk " + nama + " belok ke " + arah + " ! ");
    }
    
    public void belok(){ //kalo parameter mau diisi jangan sama dengan yg sebelumnya
        System.out.println("Error: Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Max gear : " + maxGear);
        System.out.println("Color    :" + color);
    }
    
}
