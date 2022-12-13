package com.restaklendifa.praktikumpbo.pertemuan6.tugas;

import java.sql.Date;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(".Tahun Bulan Tanggal: ");
       String dateString = sc.next();
       Date date = Date.valueOf(dateString);
       System.out.println("Hasil: " + date);
    }
}
/*
import java.util.ArrayList;
import java.util.Iterator;
 ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        
        System.out.println(list);
*/