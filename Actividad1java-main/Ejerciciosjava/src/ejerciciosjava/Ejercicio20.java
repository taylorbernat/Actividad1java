/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio20 {
    public Ejercicio20(){
    }
    public void sensor() {
        int controlador=0;
        Scanner programa = new Scanner(System.in);
        do{
            System.out.print("Ingresa la temperatura actual (Â°C): ");
            double temperatura = programa.nextDouble();

            if (temperatura >= 18 && temperatura <= 25) {
                System.out.println("La temperatura es adecuada.");
                controlador=1;

            } else {
                System.out.println("La temperatura esta fuera del rango deseado.");
            }
        
        }while(controlador==0);
       
        
    }
}
