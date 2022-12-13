package com.restaklendifa.praktikumpbo.tugasteori3;

public class Polimorfisme {
    public static void main(String[] args) {
        Bentuk2D b2d = new Bentuk2D();
        
        System.out.println("Luas Persegi Panjang : " + b2d.luas(4,3));
        System.out.println("Luas Bujur Sangkar : " + b2d.luas(4.0));
        System.out.println("Luas Segitiga : " + b2d.luas(2.0,5.0));
    }
 
}
