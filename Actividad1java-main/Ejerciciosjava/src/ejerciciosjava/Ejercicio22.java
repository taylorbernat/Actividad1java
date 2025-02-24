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
public class Ejercicio22 {
public Ejercicio22(){
    
}
    public void tareas() {
        Scanner usuario = new Scanner(System.in);
        String acumuladorTareas = "";
        String continuar;

        do {
            System.out.println("Ingrese la descripcion de la tarea: ");
            String descripcion = usuario.nextLine();
            
            System.out.println("Ingrese la fecha de vencimiento (formato: DD/MM/AAAA): ");
            String fechaVencimiento = usuario.nextLine();
            
            acumuladorTareas += "Tarea: " + descripcion + ", Fecha de vencimiento: " + fechaVencimiento + "\n";

            System.out.println("¿Desea agregar otra tarea? (si/no): ");
            continuar = usuario.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nLista de Tareas Registradas:");
        System.out.println(acumuladorTareas);
    }
}

