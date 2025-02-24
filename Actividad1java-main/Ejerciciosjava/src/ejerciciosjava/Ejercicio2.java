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
public class Ejercicio2 {
    public Ejercicio2(){
        
    }
  
    public void piso() {
        
        int pisoMaximo = 10; 
        int pisoMinimo = 1; 

        
        Scanner elevador = new Scanner(System.in);

      
        System.out.println("Ingrese el piso al que desea ir (1 a " + pisoMaximo + "): ");
        int pisoDeseado = elevador.nextInt();

     
        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            System.out.println("El ascensor se mueve al piso " + pisoDeseado);
        } else {
            System.out.println("Error: El piso ingresado no es valido. Por favor, ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo);
            piso();
        }

        
    }
}

