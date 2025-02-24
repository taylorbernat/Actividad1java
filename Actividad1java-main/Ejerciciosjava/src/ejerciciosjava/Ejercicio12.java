/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author AdminSena
 */
public class Ejercicio12 {
      public Ejercicio12(){
    
}

public void viaje() {
        
        Scanner coche = new Scanner(System.in);
        
        double saldo = 100.000;
        double montoRetiro;
        
        System.out.println("Bienvenido al cajero automatico.");
        System.out.println("Saldo actual: " + saldo);
        
        while (true) {
            System.out.print("Ingrese el monto que desea retirar: ");
            montoRetiro = coche.nextDouble();
            
            if (montoRetiro > saldo) {
                System.out.println("Error: El monto ingresado excede el saldo disponible.");
            } else if (montoRetiro <= 0) {
                System.out.println("Error: El monto de retiro debe ser mayor que cero.");
            } else {
                saldo -= montoRetiro;
                System.out.println("Retiro exitoso. Saldo restante: " + saldo);
                break;
            }
        }

        System.out.println("Gracias por usar el cajero automatico.");
    }
  }

