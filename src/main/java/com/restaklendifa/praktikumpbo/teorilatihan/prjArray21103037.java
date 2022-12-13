package com.restaklendifa.praktikumpbo.teorilatihan;

import java.util.Scanner;

public class prjArray21103037 {
    public static void main(String[] args) {
        int n, jml = 0; //deklarasi
        Scanner inputan = new Scanner(System.in); 
        System.out.println("Masukkan jumlah elemen array: ");
        n = inputan.nextInt();
        int bil[] = new int[n];
        System.out.println("Masukkan elemen array: ");
        for(int i=0; i<n; i++){
            bil[i] = inputan.nextInt();
            jml = jml + bil[i];
        }
        System.out.println("Jumlah: " +jml);
    }
    
}
/*    int n itu deklarasi, butuh scanner buat inputan, input sbg objek
masukkan jumlah elemen array : 3(n)
masukkan elemen array: 
u/n i=0 ; 0 < 3 ==> T ;i++ = 0+1=1
        bil[0] = 10
        jml=0+10=10
u/n i=1 ; 1 < 3 ==> T ;i++ = 1+1=2
        bil[1] = 20
        jml=10+20=30
u/n i=2 ; 2 < 3 ==> T ;i++ = 2+1=3
        bil[2] = 30
        jml=30+30=60
u/n i=3 ; 3 < 3 ==> F ;i++ = 3+1=4
    cari arraylist: punya limit tidak terbatas
*/