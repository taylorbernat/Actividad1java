/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejerciciosjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=30;
        do{
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("Que ejercicio desea ejecutar: ");
            Scanner respuesta = new Scanner(System.in);
            int Eleccion =  respuesta.nextInt();
            switch(Eleccion){
                case 1:
                    
                    System.out.println("\n----------------------------------------------");
                    Ejercicio1 trabajo1 =new Ejercicio1();
                    trabajo1.factura();
                    break;
                
                    
                case 2:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio2 trabajo2 = new Ejercicio2();
                    trabajo2.piso();
                    break;
                    
                    
                 case 3:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio3 trabajo3 = new Ejercicio3();
                    trabajo3.tomaPeso();
                    break;
                    
                 case 4:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio4 trabajo4 = new Ejercicio4();
                    trabajo4.sensor();
                    break;
                    
                 case 5:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio5 trabajo5 = new Ejercicio5();
                    trabajo5.umbral();
                    break;
                    
                 case 6:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio6 trabajo6 = new Ejercicio6();
                    trabajo6.revisionUmbral();
                    break;
                    
                 case 7:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio7 trabajo7 = new Ejercicio7();
                    trabajo7.tienda();
                    break;
                    
                 case 8:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio8 trabajo8 = new Ejercicio8();
                    trabajo8.masa();
                    break;
                   
                    
                    
                    
                
                
            }
        }while(opcion>0);
    }
    
}
