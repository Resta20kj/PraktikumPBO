package com.restaklendifa.praktikumpbo.pertemuan3.film;

/**
 *
 * @author resta
 */
public class Mainfilm {
    public static void main(String[] args) {
        //pembuatan class
        Film Indo = new Film("Mencuri Raden Saleh",2.34,65000);
        Film Anime = new Film("One Piece Red", 1.55,40000);
        Film Marvel = new Film("Black Panther",2.41,80000);
        
        //Memanggil method showProfile()masing-maisng object
        System.out.println("");
        Indo.showProfile();
        System.out.println("");
        Anime.showProfile();
        System.out.println("");
        Marvel.showProfile();
        System.out.println("");
        
        //Memanggil getter&setter
        System.out.println("Indonesia Film (before): " + Indo.getJudul());
        Indo.setJudul("Miracle in cell No.7");
        System.out.println("Indonesia Film (after): " + Indo.getJudul());
    }
}
