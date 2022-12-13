package com.restaklendifa.praktikumpbo.responsi;

/**
 *
 * @author resta
 */
public abstract class Pegawai {
    protected String npp;
    protected String nama;
    protected double gaji;
    
    public Pegawai(String npp,String nama,double gaji){
        this.npp = npp;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public abstract void showData();
}
