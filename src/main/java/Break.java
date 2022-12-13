/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author resta
 */
public class Break {
    public static void main(String[] args) {
    // While
    int j = 1;
        while(j <= 100){
            System.out.println("Loading...(" + j + "%)");
            j+=10;

            if(j == 50){
                System.out.println("Udah ah, capek!");
                break;
            }
        }
        System.out.println("Looping While selesai! \n");
    }  
}
