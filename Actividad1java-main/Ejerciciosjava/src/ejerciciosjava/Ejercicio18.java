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
public class Ejercicio18 {
     public Ejercicio18(){

  }
     public void biblioteca() {
        Scanner libro = new Scanner(System.in);
        String continuar;
        String acumuladorLibros = "";

        do {
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = libro.nextLine();
            
            System.out.print("Ingrese el autor del libro: ");
            String autor = libro.nextLine();

            System.out.print("Ingrese el numero de paginas: ");
            int paginas = libro.nextInt();
            libro.nextLine();
            acumuladorLibros += "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + "\n";
            
            System.out.print("¿Desea registrar otro libro? (si/no): ");
            continuar = libro.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nLista de libros registrados:");
        System.out.println(acumuladorLibros);

    }
}

