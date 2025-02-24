
package ejerciciosjava;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio27 {
    public Ejercicio27(){
    
    }
    
    public void numeros(){
        Random aleatoreo= new Random();
        int suma=0;
        System.out.println("Hola");
        for(int i=1 ; i<=5 ; i++){
            System.out.println("Elige un numero entre el 1 y el 100");
            Scanner respuesta =  new Scanner(System.in);
            int numero = respuesta.nextInt();
            if(numero>100 ||  numero<1){
                int numeroAleatoreo=aleatoreo.nextInt(100);
                System.out.println("numero fuera del rango se tomara uno de forma random");
                suma=suma+numeroAleatoreo;
            }else{
                suma=suma+numero;
            }  
        }
        System.out.println(suma);
    }
}
