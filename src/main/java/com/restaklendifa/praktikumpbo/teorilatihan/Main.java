package com.restaklendifa.praktikumpbo.teorilatihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        public static BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        int jmlMK, jmlSertif, jamKerja,jamLembur;
        String npp, nama;
        double gaji;
        
        Pegawai peg[] = new Pegawai [4];
        for(int i=0; i<2 ; i++){
            System.out.println("NPP: "); npp=inputan.readline();
            peg[i] =  new Dosen(npp, nama, gaji,jmlMK, jmlSertif, jmlKerja, jmlLembur);
        }
    }
}
