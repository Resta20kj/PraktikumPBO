package com.restaklendifa.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //pembuatan object
        //Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Truk nw = new Truk();
        
        //Memasukkan nilai attribute
        mb.klsKendaraan = "Mobil";
        mb.nama = "Toyota";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.klsKendaraan = "Misterius";
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        nw.klsKendaraan = "Truk";
        nw.nama = "Cargo";
        nw.jmlRoda = 8;
        nw.maxGear = 6;
        nw.color = "Green";
        
        //uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("kanan");
        mb.belok();
        System.out.println("");
        kn.showInfo();
        kn.nyalakanMesin();
        System.out.println("");
        nw.showInfo();
        nw.belok("kiri");
        nw.belok();
        
    }
}
