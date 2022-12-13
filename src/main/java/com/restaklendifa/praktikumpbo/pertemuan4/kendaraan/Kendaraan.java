package com.restaklendifa.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    //Attribute (variabel)
    String nama,klsKendaraan;
    int jmlRoda;
    
//Method
public void nyalakanMesin(){
    System.out.println("Mesin " + nama + "telah dinyalakan");
}

public void showInfo(){
    System.out.println("Kelas kendaraan " + klsKendaraan);
    System.out.println("Nama     : " + nama);
    System.out.println("Jml Roda :" + jmlRoda);
    extraInfo(); 
}
//kosong karena, buat nyelipin
public void extraInfo(){}

}