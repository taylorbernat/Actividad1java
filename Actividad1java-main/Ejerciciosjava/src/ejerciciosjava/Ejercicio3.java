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
public class Ejercicio3 {
    public Ejercicio3(){
    
}

    public void tomaPeso(){
        System.out.println("Escriba su peso");
        Scanner respuesta = new Scanner(System.in);
        double peso = respuesta.nextDouble();
        System.out.println("A que piso desea ir");
        int piso = respuesta.nextInt();
        if(peso>120){
            System.out.println("Su peso excede el limite");
            tomaPeso();
            
        }else{
            System.out.println("En camino al piso "+piso);
        }
        
    }  
}
