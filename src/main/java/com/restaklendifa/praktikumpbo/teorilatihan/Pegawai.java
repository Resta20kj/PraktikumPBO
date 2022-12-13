package com.restaklendifa.praktikumpbo.teorilatihan;

public abstract class Pegawai {
    protected String npp;
    protected String nama;
    protected double gaji;
    //constructor 1
    public Pegawai(String npp, String nama, double gaji){
        this.npp = npp;
        this.nama = nama;
        this. gaji = gaji;
    }
    
    public abstract void showData();
    
}
