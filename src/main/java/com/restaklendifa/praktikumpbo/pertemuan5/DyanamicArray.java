package com.restaklendifa.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DyanamicArray {
    public static void main(String[] args) {
        //Deklarasi scanner untk user input nanti
        Scanner input = new Scanner(System.in);
        
        //membuat agar panjang array ditentukan input user
        System.out.println("--Program Input Nilai--");
        System.out.print("Masukkan jumlah matkul :");
        int jml = input.nextInt();
        System.out.print("");
        
        //membuat array baru dengan panjang sesuai input user
        int[] nilai = new int[jml];
        
        //memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("");
        
        //menampilkan semua nilai array
        System.out.println("-- Daftar Nilai --");
        for(int i=0; i<jml; i++){
            System.out.println(i +": " + nilai[i]);
        }
        System.out.println("");
        //total nilai
        float rata,total=0;
        for(int i=0; i<jml; i++){
            total=total+nilai[i];
        }
        //menghitung nilai rata-rata
        rata=(total/jml);
        System.out.println("Total nilai: " + total);
        System.out.println("Nilai rata-rata: " + rata);
                
    }
}
