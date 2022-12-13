package com.restaklendifa.praktikumpbo.teorilatihan;

public class Dosen extends Pegawai implements IhitungTotal{
    private int jumlahMatkul;
    private int jumlahSertifikasi;
    
    public Dosen (String npp, String nama, double gaji){
        super(npp, nama, gaji);
        this.jumlahMatkul = jumlahMatkul;
        this.jumlahSertifikasi = jumlahSertifikasi;
    }
    
    public void showData(){
        System.out.println("NPP : "  + npp);
        System.out.println("Nama: "  + nama);
        System.out.println("Gaji: "  + gaji);
    }
    
    public double totalPendapatan(){
        return gaji+(jumlahMatkul*250000)+(jumlahSertifikasi*100000);
    }
    
            
}
