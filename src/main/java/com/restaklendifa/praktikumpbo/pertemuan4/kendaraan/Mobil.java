package com.restaklendifa.praktikumpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan{//Child class dari Kendaraan
    int maxGear;
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke " + arah + " ! ");
    }
    
     public void extraInfo(){ 
         //akan menampilkan input/isi dari maxGear
        System.out.println("Max gear : " + maxGear);
    }
    
    public void belok(){ //kalo parameter mau diisi jangan sama dengan yg sebelumnya
        System.out.println("Error: Mohon masukkan arah!");
    }
    
}
