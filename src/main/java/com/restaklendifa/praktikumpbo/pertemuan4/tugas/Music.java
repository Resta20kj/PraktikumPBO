package com.restaklendifa.praktikumpbo.pertemuan4.tugas;

/**
 *
 * @author resta
 */
public class Music {
    //Attribute (variabel)
    String judul, penyanyi;
    double durasi;
    
    //Method
    public void playMusic(){
        System.out.println("Music " + judul + " sedang diputar ");
    }
    
    public void showInfo(){
    System.out.println("Judul    : " + judul);
    System.out.println("Penyanyi : " + penyanyi);
    System.out.println("Durasi   : " + durasi + " menit");
    extraInfo(); 
}
//kosong karena, buat nyelipin.Bentuk polymorphism
public void extraInfo(){}

}
