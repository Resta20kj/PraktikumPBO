package com.restaklendifa.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        try {
            System.out.println("Masukkan bilangan: ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukkan pembagi: ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan/pembagi;
            System.out.println("Hasil pembagian (dibulatkan) : " + hasil);
            
        }
        /*error 2 jadi 1
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("Tidak dapat memproses");
        }
        */
        catch(ArithmeticException e){
            System.out.println("Bilangan tidak bisa diagi 0!");
        }
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja!");
        }
    }
 
}
