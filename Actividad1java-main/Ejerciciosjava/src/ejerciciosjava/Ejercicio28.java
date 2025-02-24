/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;


public class Ejercicio28 {
    
    public Ejercicio28(){
    
    }
    
     public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        
        double totalVentas = 0;
        String productosVendidos = "";

        System.out.println("Cuantos productos se van a registrar");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ": ");
            String nombreProducto = scanner.nextLine();
            
            System.out.println("Ingrese el precio del producto " + i + ": ");
            double precioProducto = scanner.nextDouble();
            
            System.out.println("Ingrese la cantidad vendida del producto " + i + ": ");
            int cantidadVendida = scanner.nextInt();
            scanner.nextLine();

            double totalProducto = precioProducto * cantidadVendida;
            totalVentas += totalProducto;
            
            productosVendidos += nombreProducto + " (Cantidad: " + cantidadVendida + ", Precio: " + precioProducto + ")\n";
        }
        
        System.out.println("\n### Resumen de Ventas ###");
        System.out.println("Productos Vendidos:");
        System.out.println(productosVendidos);
        System.out.println("Total de ventas: $" + totalVentas);
    }
}
