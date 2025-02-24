
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio26 {
    public Ejercicio26(){
    
    
    }
    
    public void libretaContactos(){
        String contactos="";
        System.out.println("Escriba la cantidad de contacctos que van a ser registrados");
        Scanner respuesta = new Scanner(System.in);
        int cantidad = respuesta.nextInt();
        for(int i=1; i<=cantidad; i++){
            System.out.println("Escriba el nombre del contacto: "+i);
            String nombre = respuesta.next();
            System.out.println("Escriba el numero del contacto: "+i    );
            String numero = respuesta.next();
            contactos= contactos+nombre+"         "+numero+"\n";
        }
        System.out.println("Nombre          Numero");
        System.out.println(contactos);
    
    }
    
}
