package com.restaklendifa.praktikumpbo.pertemuan3.film;

/**
 *
 * @author resta
 */
public class Film {
    private String judul;
    private double durasi;
    private int hargaTiket;
    
    //constructor
    public Film(String judul, double durasi, int hargaTiket) {
        this.judul = judul;
        this.durasi = durasi;
        this.hargaTiket = hargaTiket;
    }
    //Menjalankan method, mencetak semua attribute
    public void showProfile(){
        System.out.println("Judul       : " + judul);
        System.out.println("Durasi      : " + durasi + " jam ");
        System.out.println("Harga Tiket : Rp " + hargaTiket);
    }
    
    //penggunaan getter&setter
    public String getJudul() {
        return judul;
    }

    public double getDurasi() {
        return durasi;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    
}
