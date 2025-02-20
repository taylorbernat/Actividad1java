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
public class Ejercicio7 {
     public Ejercicio7(){
    
}

    public void tienda() {
        Scanner compra = new Scanner(System.in);

        double precioA = 50.0; 
        double precioV = 100.0;
        double precioE = 200.0;

      
        System.out.print("Ingrese el tipo de producto (A - Alimentos, V - Vestimenta, E - Electrnicos): ");
        String tipoProducto = compra.next().toUpperCase();

        
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = compra.nextInt();

        
        if (cantidad <= 0) {
            System.out.println("La cantidad de unidades debe ser un número positivo.");
        } else {
            double costoTotalSinDescuento = 0;
            double descuento = 0;

           
            switch (tipoProducto) {
                case "A": 
                    costoTotalSinDescuento = precioA * cantidad;
                    descuento = costoTotalSinDescuento * 0.10; 
                    break;
                case "V": 
                    costoTotalSinDescuento = precioV * cantidad;
                    descuento = costoTotalSinDescuento * 0.05; 
                    break;
                case "E": 
                    costoTotalSinDescuento = precioE * cantidad;
                    descuento = 0;
                    break;
                default:
                    System.out.println("Tipo de producto no válido.");
                    return; 
            }

            
            double costoTotalConDescuento = costoTotalSinDescuento - descuento;

           
            System.out.println("Costo total sin descuento: $" + costoTotalSinDescuento);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Costo total con descuento: $" + costoTotalConDescuento);
        }

    }
}

