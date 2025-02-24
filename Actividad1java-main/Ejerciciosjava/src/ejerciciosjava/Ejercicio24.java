    
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio24 {
    public Ejercicio24(){
    
    
    }
    public void registroVehiculos(){
        String autos="";
        System.out.println("Escriba la cantidad de autos que van a ser registrados");
        Scanner respuesta = new Scanner(System.in);
        int cantidad = respuesta.nextInt();
        for(int i=1; i<=cantidad; i++){
            System.out.println("Escriba la placa del vehiculo: "+i);
            String placa = respuesta.next();
            System.out.println("Escriba la hora de entrada del vehiculo: "+i    );
            String hora = respuesta.next();
            autos= autos+placa+"               "+hora+"\n";
        }
        System.out.println("Placas          Horas");
        System.out.println(autos);
    }
    
}
