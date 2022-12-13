package com.restaklendifa.praktikumpbo.pertemuan3.animal;

/**
 *
 * @author resta
 */
public class Main {
    
    //main+tab
    public static void main(String[] args) {
        //Pembuatan class. pake yang ada parameter
        Animal cat = new Animal("Miyu",3,"Black");
        Animal dog = new Animal("Poodle",5,"White");
        Animal rabbit = new Animal("Incy",2,"Red");
        
        //Memanggil method showProfile()masing-maisng object
        cat.showProfile();
        System.out.println("");
        dog.showProfile();
        System.out.println("");
        rabbit.showProfile();
        /*
        //Membuat object dari class Animal. pake parameter yang kosong
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal rabbit = new Animal();
      
        //Mengisi nilai attribute object 'cat'
        cat.name = "Miyu";
        cat.age = 3;
        cat.color = "Black";
        //Memanggil method showProfile()
        cat.showProfile();
        System.out.println("");
        
        //Mengisi nilai attribute object 'dog'
        dog.name = "Poodle";
        dog.age = 5;
        dog.color = "White";
        //Memanggil method showProfile()
        dog.showProfile();
        System.out.println("");
        
        //Mengisi nilai attribute object 'rabbit'
        rabbit.name = "Incy";
        rabbit.age = 2;
        rabbit.color = "Red";
        //Memanggil method showProfile()
        rabbit.showProfile();
        */
        //Demo getter& setter
        System.out.println("");
        System.out.println("Dog's name (before): " + dog.getName());
        dog.setName("Dip");
        System.out.println("Dog's name (after): " + dog.getName());
        
    }  
}
        
/*Public file : bisa dibaca difile lain. dipake kalo bolehin org lain akses
private : ga bisa dibaca di kelas lain. kalau mau maksa pakai
ada cara cepet alt+fn+insert-->getter&setter*/
