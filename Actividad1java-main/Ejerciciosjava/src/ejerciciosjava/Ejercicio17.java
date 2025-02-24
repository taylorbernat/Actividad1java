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
public class Ejercicio17 {
    public Ejercicio17(){
    
  }

    public void juego() {
        Scanner adivinanza = new Scanner(System.in);
        
        int numeroSecreto = 50;
        int intento;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He elegido un numero entre 1 y 100. ¡Intenta adivinarlo!");

        while (true) {
            System.out.print("Introduce tu intento: ");
            intento = adivinanza.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("¡El numero es mayor! Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("¡El numero es menor! Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el numero.");
                break;
            }
        }
    }
}
