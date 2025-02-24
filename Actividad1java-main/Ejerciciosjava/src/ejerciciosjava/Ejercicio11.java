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
public class Ejercicio11 {
public Ejercicio11(){
    
}
public void menu(){
         
        
        int hamburguesa = 15000;
        int perroCaliente = 9000;
        int sandwhitch= 12000;
        int gaseosa=5000;
        int total =0;
        int controlador=1;
        do{
        System.out.println("Cual va a ser su eleccion de alimentos\n-1.Hamburguesas\n-2.Perro caliente\n-3.Sandwhitch\n-4.Gaseosa\n-5.Pagar");
        Scanner respuesta = new Scanner(System.in);
        int eleccion = respuesta.nextInt();
        switch(eleccion){
            case 1:
                total=total+hamburguesa;
                break;
            case 2:
                total=total+perroCaliente;
                break;

            case 3:
                total=total+sandwhitch;
                break;

            case 4:
                total=total+gaseosa;
                break;

                
            case 5:
                System.out.println("Gracias por su compra el total a pagar es: "+total);
                controlador=0;
                break;


            default:
                System.out.println("Lo que usted esta solicitando se a agotado o no esta disponible");
                
        }
        
        }while(controlador!=0);
        
        
    }
}
