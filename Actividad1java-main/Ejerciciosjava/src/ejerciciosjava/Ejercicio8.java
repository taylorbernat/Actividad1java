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
public class Ejercicio8 {
    public Ejercicio8(){
    
}
    
    public void asistente(){
      
        Scanner paciente = new Scanner(System.in);

     
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = paciente.nextDouble();
        
        System.out.print("Introduce tu altura en metros: ");
        double altura = paciente.nextDouble();

        double imc = peso / (altura * altura);
        
        String categoria;
        
        switch ((imc < 18.5) ? 1 : (imc < 24.9) ? 2 : (imc < 29.9) ? 3 : 4) {
            case 1:
                categoria = "Bajo peso";
                break;
            case 2:
                categoria = "Peso normal";
                break;
            case 3:
                categoria = "Sobrepeso";
                break;
            case 4:
                categoria = "Obesidad";
                break;
            default:
                categoria = "Categoría desconocida";
                break;
        }

        System.out.println("Tu IMC es:" + imc);
        System.out.println("Categoría: " + categoria);

    }
}
