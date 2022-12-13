package com.restaklendifa.praktikumpbo.pertemuan5;

public class Array2 {
     public static void main(String[] args) {
        //pembuatan array dengan mengisi langsung datanya
        String[] names = {"Rain","Rainbow","Flash"};
        
        //cek panjang array
        System.out.println("Panjang array: " +names.length);
        
        //menampilkan semua nilai array 
        for(int i=0; i<names.length; i++){
            System.out.println ( i +": " + names[i]);
        }
    }
}
