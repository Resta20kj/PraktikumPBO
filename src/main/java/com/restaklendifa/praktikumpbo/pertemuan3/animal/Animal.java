/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Membuat package baru dengan nama seperti dibawah ini
package com.restaklendifa.praktikumpbo.pertemuan3.animal;

/**
 *
 * @author resta
 */
//Terdapat Java class dengan nama Animal dengan modifiernya public
public class Animal {
    //Attribute dengan modifier private
    private String name;
    private int age;
    private String color;
    
    /*Constructor cara cepat isi data dengan trik 
    fn+alt+insert--> Constructor--> select all*/
    /*
    Cara 1 dengan constructor kosong/tidak terdapat parameter.
    pembuatan/pengisian,pemanggilan object di Main.java 
    
    public Animal(){}
    */
    /*
    Cara 2 dengan constructor berparameter 
    */
    public Animal(String name, int age, String color) {
        this.name /*menunjuk pada atribut*/= name; //menunjuk pada parameter
        this.age = age;
        this.color = color;
    }
    
    
    
    //Menjalankan Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age + " years old ");
        System.out.println("Color : " + color);
    }
    //alt+fn+insert-->getter & setter cara cepat
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
