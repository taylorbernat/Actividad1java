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
public class Ejercicio6 {
    public Ejercicio6(){
    
}
public void revisionUmbral(){
        
        System.out.println("Escriba la temperatura");
        Scanner respuesta = new Scanner(System.in);
        double temperatura = respuesta.nextDouble();
        if(temperatura>50){
            System.out.println("El umbral de temperatura es muy alto");
        }else{
            System.out.println("Escriba el piso al que desea ir");
            int piso = respuesta.nextInt();
            System.out.println("En camino al piso "+piso);
            
        }
        
      }
        
    }
