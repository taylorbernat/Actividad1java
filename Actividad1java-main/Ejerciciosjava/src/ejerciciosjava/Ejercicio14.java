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
public class Ejercicio14 {
     public Ejercicio14(){
    
}
    public void impresora () {
        Scanner hojas = new Scanner(System.in);

        int papelDisponible = 100; 
        int paginasAImprimir;

        while (papelDisponible > 0) {
            System.out.println("Ingrese la cantidad de paginas a imprimir: ");
            paginasAImprimir = hojas.nextInt();

            if (paginasAImprimir <= papelDisponible) {
                papelDisponible -= paginasAImprimir;
                System.out.println("Se han impreso " + paginasAImprimir + " páginas.");
                System.out.println("Papel restante: " + papelDisponible + " hojas.");
            } else {
                System.out.println("No hay suficiente papel para imprimir esa cantidad de paginas.");
                System.out.println("Papel restante: " + papelDisponible + " hojas.");
            }

            if (papelDisponible == 0) {
                System.out.println("La impresora se ha quedado sin papel.");
                break;
            }
        }
    }
}
