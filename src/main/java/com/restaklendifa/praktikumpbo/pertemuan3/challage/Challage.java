package com.restaklendifa.praktikumpbo.pertemuan3.challage;

/**
 *
 * @author resta
 */
public class Challage {
    //Attribute dengan modifier private
    private String name;
    private int visitorsToday;
    private int yearBuilt;
    
    //constructor berparameter
    public Challage(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    //Menjalankan method, mencetak semua attribute
    public void showProfile(){
        System.out.println("Name           : " + name);
        System.out.println("Visitors Today : " + visitorsToday);
        System.out.println("Year Built     : " + yearBuilt);
    }
    
    //Penggunaan Getter&Setter
    public String getName() {
        return name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
}


