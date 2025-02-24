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
public class Ejercicio10 {
public Ejercicio10(){
    
}

  public void decicion(){
        System.out.println("Escriba la opcion:\n-1.Ganador\n-2.Perdedor\n-3.Empate");
        Scanner respuesta = new Scanner(System.in);
        int Decicion = respuesta.nextInt();
        switch(Decicion){
            case 1:
                System.out.println("Su equipo recibe 3 puntos");
                break;               
            case 2:
                System.out.println("Su equipo no recibe puntos");
                break;
            case 3:
                System.out.println("Su equipo recibe 1 punto");
                break;
            default:
                System.out.println("Decicion fuera de rango");
                decicion();
        
        
        }
    
    }
}
