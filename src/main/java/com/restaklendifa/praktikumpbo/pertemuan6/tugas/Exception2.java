package com.restaklendifa.praktikumpbo.pertemuan6.tugas;

public class Exception2 {
    int m;
    public void setMarks(int marks){
        if(marks < 0 || marks > 100){
            throw new IllegalArgumentException(Integer.toString(marks));
        }else{
            m=marks;
        }
    }
    public static void main(String[] args) {
        Exception2 ex2 = new Exception2();
        ex2.setMarks(70);
        System.out.println(ex2.m);
    }
}
