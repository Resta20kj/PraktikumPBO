package com.restaklendifa.praktikumpbo.pertemuan4.tugas;

public class Pop extends Music {
    String genrePop;
    public void replay(String acak){
        System.out.println("Music " + judul + " akan diacak ");
    }
    
    public void extraInfo(){
        System.out.println("Genre Pop : " + genrePop );
    }
    
    public void replay(){
        System.out.println("Music " + judul + " akan diulang ");
    }
}
