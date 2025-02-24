/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio21 {
public Ejercicio21(){
    
}
    public void examenes() {
        Scanner resultados = new Scanner(System.in);
        double sumaNotas = 0.0;
        int contadorNotas = 0;
        String continuar = null;

        do {
            System.out.println("Ingrese el resultado del examen (nota de 0 a 10): ");
            double nota = resultados.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida. Por favor, ingrese una nota entre 0 y 10.");
                continue;
            }

            sumaNotas += nota;
            contadorNotas++;

            System.out.println("¿Desea ingresar otro resultado? (si/no): ");
            resultados.nextLine();
            continuar = resultados.nextLine();

        } while (continuar.equalsIgnoreCase("si"));
        
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("\nEl promedio de las notas es: " + promedio);

            if (promedio >= 6.0) {
                System.out.println("Felicidades Has aprobado.");
            } else {
                System.out.println("Lo siento, has reprobado.");
            }
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
