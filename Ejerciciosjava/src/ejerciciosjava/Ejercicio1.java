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
public class Ejercicio1 {
    public Ejercicio1(){
        
    }
    public void asdasd(){
        Scanner tomar = new Scanner(System.in);
    }
       public int pedirCedula(){
        System.out.println("Escriba su numero de cedula");
        Scanner respuesta = new Scanner(System.in);
        int cedula =  respuesta.nextInt();
        return cedula;
    }
    public int pedirPrecio(){
        System.out.println("cuantos objetos va a llevar: ");
        Scanner respuesta = new Scanner(System.in);
        int cantidad =  respuesta.nextInt();
        int precio=cantidad*4500;
        if(precio>25000){
            int descuento=(int)(precio*0.05);
            int total=precio-descuento;
            return total;
        }
       return precio;

    }
    public String pedirNombre(){
        System.out.println("Cual es su nombre: ");
        Scanner respuesta = new Scanner(System.in);
        String nombre = respuesta.next();
        return nombre ;
    }
    public void factura(){
        int cedula=pedirCedula();
        int total=pedirPrecio();
        String nombre=pedirNombre();

        System.out.println("Cual es su nombre: "+nombre);
        System.out.println("cual es su cedula: "+cedula);
        System.out.println("cual es su total a pagar: "+total);


    }
}
