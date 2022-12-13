package com.restaklendifa.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        //membuat array isi 3
        int[] myNumbers = {1,2,3};
        
        //uji cuba print nilai array index ke 10. nangkap 1 error
        try {
           System.out.println(myNumbers[10]); 
        }
        //parameter catch diisi pesan errornya
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array ga sebesar itu!"); 
        }
        System.out.println("Proses selesai");
    }
}
/*kode yg sering error masukin ke try,trs kalo error lag nanti mampir ke catch
tapi kalo code yg di try ga error maka akan langsung ke luar catch
*/