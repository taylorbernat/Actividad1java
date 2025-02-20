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
public class Ejercicio16 {
     public Ejercicio16(){
    
}
     public void cuentaRegresiva() {
        Scanner cuenta = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo para comenzar la cuenta regresiva: ");
        int numero = cuenta.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número positivo.");
            return;
        }

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("Tiempo cumplido");
    }

    public  void contar() {
        cuentaRegresiva();
    }
}
