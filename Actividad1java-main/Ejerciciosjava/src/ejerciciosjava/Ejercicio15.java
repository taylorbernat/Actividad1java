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
public class Ejercicio15 {
    public Ejercicio15(){
    
}

    public void viaje() {
        Scanner coche = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa la distancia total del viaje en kilometros: ");
            double distancia = coche.nextDouble();

            System.out.print("Ingresa la velocidad promedio del coche en km/h: ");
            double velocidad = coche.nextDouble();

            double tiempo = distancia / velocidad;

            System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");

            System.out.print("¿Deseas hacer otro viaje? (si/no): ");
            String respuesta = coche.next();

            if (respuesta.toLowerCase().equals("no")) {
                continuar = false;
            }
        }

        System.out.println("Gracias por usar el simulador de viajes.");
    }
}

