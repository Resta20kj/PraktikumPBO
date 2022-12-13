package com.restaklendifa.praktikumpbo.pertemuan4.tugas;

public class Main {//akan menjalankan dan menampilkan output 
    public static void main(String[] args) {
    //pembuatan object
    //Class object = new Class();
    Pop msc = new Pop();
    
    //memasukkan nilai attribute
    msc.judul="Takut";
    msc.penyanyi="Idgitaf";
    msc.durasi=5.20;
    msc.genrePop="Indo Pop";
    
    //pemanggilan method
    msc.showInfo();
    msc.playMusic();
    msc.replay("acak");
    msc.replay();
    }
    
}
