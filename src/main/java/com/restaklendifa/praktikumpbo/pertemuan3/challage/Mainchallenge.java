package com.restaklendifa.praktikumpbo.pertemuan3.challage;

/**
 *
 * @author resta
 */
public class Mainchallenge {
    public static void main(String[] args) {
        //Pembuatan class 
        Challage Comedy = new Challage("Pio",2,2020);
        Challage Fantasy = new Challage("Mickey",3,2021);
        Challage Spy = new Challage("Anya",5,2022);
    
        //Memanggil method showProfile()masing-maisng object
        System.out.println("");
        Comedy.showProfile();
        System.out.println("");
        Fantasy.showProfile();
        System.out.println("");
        Spy.showProfile();
        
        System.out.println("");
        System.out.println("Fantasy name (before): " + Fantasy.getName());
        Fantasy.setName("Draken");
        System.out.println("Fantasy name (after): " + Fantasy.getName());
    }

    
}
