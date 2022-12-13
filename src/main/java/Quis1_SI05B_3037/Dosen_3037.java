package Quis1_SI05B_3037;

public class Dosen_3037 extends Penduduk_3037{
    private String nidn_3037;
    private String gol_3037;
    private int gajiPokok_3037;
    
    public String totalPendapatan_3037(){
        
        return gajiPokok_3037 + gol_3037;
        
    }
    public void tampilDataDosen_3037(){
        
        System.out.println("NIDN :");
        System.out.println("Golongan :");
        System.out.println("Gaji Pokok");
        
    }
}
