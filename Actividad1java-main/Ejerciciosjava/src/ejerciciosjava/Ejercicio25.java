
package ejerciciosjava;
import java.util.Scanner;


public class Ejercicio25 {
    public Ejercicio25(){
    
    }
    public void comprarProductos(){
        int total=0;
        String resultado="";
        System.out.println("Escriba la canridad de producto que desea llevar:");
        Scanner respuesta = new Scanner(System.in);
        int cantidad = respuesta.nextInt();
        for(int i=1; i<=cantidad; i++){
            System.out.println("Escriba el nombre del producto: "+i);
            String nombre = respuesta.next();
            System.out.println("Escriba el precio del producto: "+i);
            int precio = respuesta.nextInt();
            System.out.println("Escriba la cantidad llevada del producto: "+i);
            int cantidades= respuesta.nextInt();
            resultado=resultado+nombre+"                 "+precio+"               "+cantidades+"               "+(precio*cantidades)+"\n";
            total= total+(precio*cantidades);
        }
        System.out.println("nombre           Precio           Cantida           Precio Uni          Total");
        System.out.println(resultado);
        
        System.out.println("Suma total:                                                         "+total);
    }
}
