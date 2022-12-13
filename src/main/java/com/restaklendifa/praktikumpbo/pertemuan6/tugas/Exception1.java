package com.restaklendifa.praktikumpbo.pertemuan6.tugas;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int nomer;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Masukkan nomer yang valid :");
            try{
                //parseInt(sc.next())mengubah String menjadi Integer/kebilangan bulat
                nomer = Integer.parseInt(sc.next());
                System.out.println("Masukkan anda: " + nomer );
                break;
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormatException terjadi");
            }
        }
    }
}

