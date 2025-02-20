/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class Ejercicio4 {
     public Ejercicio4(){
        
    }
   

    public void sensor() {
        
        Scanner programa = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura actual (°C): ");
        double temperatura = programa.nextDouble();
        
        if (temperatura >= 18 && temperatura <= 25) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura esta fuera del rango deseado.");
        }
        
}

}
