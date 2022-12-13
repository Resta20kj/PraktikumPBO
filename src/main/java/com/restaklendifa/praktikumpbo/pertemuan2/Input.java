package com.restaklendifa.praktikumpbo.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author resta
 */
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        //digunakan untuk mengimpor scanner/inputan
        
        System.out.print("Masukkan nama:");
        String nama = input.nextLine();
        //input berbasis scanner
        System.out.print("Masukkan usia:");
        int usia = input.nextInt();
        System.out.println("");
        //print out dengan enter
        System.out.println("Nama saya:" + nama);
        System.out.println("Usia saya:" + usia + " tahun ");
    }
}
