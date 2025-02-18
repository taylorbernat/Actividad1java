
package ejerciciosjava;
import java.util.Scanner;


public class Ejercicio1 {
    public Ejercicio1(){
        
    }
public int pedirCedula(){
        System.out.println("Escriba su numero de cedula");
        Scanner respuesta = new Scanner(System.in);
        int cedula =  respuesta.nextInt();
        return cedula;
    }
    public int pedirPrecio(){
        System.out.println("cuantos objetos va a llevar tomando en cuent a que cada producto vale 4500: ");
        Scanner respuesta = new Scanner(System.in);
        int cantidad =  respuesta.nextInt();
        int precio=cantidad*4500;
        
        return precio;

    }
    public String pedirNombre(){
        System.out.println("Cual es su nombre: ");
        Scanner respuesta = new Scanner(System.in);
        String nombre = respuesta.next();
        return nombre ;
    }
    
    public String estrato(){
        System.out.println("Cual es su estrato A,B o C: ");
        Scanner respuesta = new Scanner(System.in);
        String eleccion = respuesta.next().toUpperCase();
        if(eleccion.equals("A") || eleccion.equals("B") ||  eleccion.equals("") ){
            
            return eleccion;

        }else{
            System.out.println("Estrato invalido se elegira uno por defecto");
            return "C";

        }
    }
    
    
    public String estudiante(){
        System.out.println("Es un estudiante Si o No");
        Scanner respuesta = new Scanner(System.in);
        String eleccion = respuesta.next().toUpperCase();
        
        if(eleccion.equals("SI") || eleccion.equals("NO")){
            System.out.println("");
            return eleccion;
            
        }
        else{
            System.out.println("Su eleccion no es valida se elegira algo por defecto");
            return "NO";
        }
        
    }
    
    public int precioTotal(int precio,String estudiante){
        
        if(estudiante.equals("SI")){
            int descuento=(int)(precio*0.05);
            int total=precio+descuento;
            return total;
        }else{
           int descuento=(int)(precio*0.13);
            int total=precio+descuento;
            return total; 
        }
    }
    public void factura(){
        int cedula=pedirCedula();
        int total=pedirPrecio();
        String nombre=pedirNombre();
        String estrato=estrato();
        String estudiante= estudiante();
        int Impuesto =precioTotal(total,estudiante);
        System.out.println("Nombre Cliente: "+nombre);
        System.out.println("Cedula Cliente: "+cedula);
        System.out.println("Total: "+total);
        System.out.println("su estrato es: "+estrato);
        System.out.println("Estudiante: "+estudiante);
        System.out.println("Total con impuesto: "+Impuesto);




    }
}
