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
public class Ejercicio19 {
     public Ejercicio19(){
    
}
    public void comida() {
        Scanner menu = new Scanner(System.in);
        double costoTotal = 0.0;
        String continuar = null;

        do {
            System.out.println("Menu de Comidas Rapidas:");
            System.out.println("1. Hamburguesa - $5.50");
            System.out.println("2. Pizza - $7.00");
            System.out.println("3. Hot Dog - $3.00");
            System.out.println("4. Papas Fritas - $2.50");
            System.out.println("5. Refresco - $1.50");
            System.out.println("6. Finalizar pedido");

            
            System.out.println("Seleccione el numero de la opcion que desea: ");
            int opcion = menu.nextInt();
            menu.nextLine();

            switch (opcion) {
                case 1:
                    costoTotal += 5.50;
                    System.out.println("Has agregado una Hamburguesa. Costo: $5.50");
                    break;
                case 2:
                    costoTotal += 7.00;
                    System.out.println("Has agregado una Pizza. Costo: $7.00");
                    break;
                case 3:
                    costoTotal += 3.00;
                    System.out.println("Has agregado un Hot Dog. Costo: $3.00");
                    break;
                case 4:
                    costoTotal += 2.50;
                    System.out.println("Has agregado Papas Fritas. Costo: $2.50");
                    break;
                case 5:
                    costoTotal += 1.50;
                    System.out.println("Has agregado un Refresco. Costo: $1.50");
                    break;
                case 6:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    continue;
            }

            if (opcion != 6) {
                System.out.println("¿Desea agregar otro articulo al pedido? (si/no): ");
                continuar = menu.nextLine();
            } else {
                continuar = "no";
            }

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nEl costo total de su pedido es: $" + costoTotal);
        System.out.println("Gracias por su pedido");
    }
}
