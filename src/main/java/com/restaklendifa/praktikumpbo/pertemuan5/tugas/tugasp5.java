package com.restaklendifa.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class tugasp5 {
    public static void main(String[] args) {
        //Deklarasi scanner untuk input
        Scanner input =  new Scanner(System.in);
        
        System.out.println("\t Program input HAPADI");
        System.out.println("Program ini digunakan untuk menginput hasil panen  padi");
        //deklarasi panjang array sesuai keinginan user
        System.out.print("Masukkan jumlah sawah: ");
        int jml = input.nextInt();
        System.out.print("");
        
        //membuat array sesuai input dari user
        int[] sawah = new int[jml];
        
        //input data
        for(int i=0; i<jml; i++){
             System.out.print("Sawah ke " + (i+1) + ": " );
             sawah[i] = input.nextInt();
        }
        System.out.println("");
        //menampilkan semua nilai array
        System.out.println("---Rekap data---");
        for(int i=0; i<jml; i++){
            System.out.println("Sawah ke " + (i+1) + ": " + sawah[i] + " kg");
        }
        System.out.println("");
        float rata,total=0;
        //menghitung total panen
        for(int i=0; i<jml; i++){
            total=total+sawah[i];
        }
        System.out.println("Total panen: " + total +" kg");
        
        //menghitung rata-rata hasil panen
        rata=(total/jml);
        System.out.println("Rata-rata hasil panen padi: " + rata + "kg");
    }
}
