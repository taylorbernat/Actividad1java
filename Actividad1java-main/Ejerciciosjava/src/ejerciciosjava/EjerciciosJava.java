/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=28;
        do{
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("Que ejercicio desea ejecutar: ");
            Scanner respuesta = new Scanner(System.in);
            int Eleccion =  respuesta.nextInt();
            switch(Eleccion){
                case 1:
                    
                    System.out.println("\n----------------------------------------------");
                    Ejercicio1 trabajo1 =new Ejercicio1();
                    trabajo1.factura();
                    break;
                
                    
                case 2:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio2 trabajo2 = new Ejercicio2();
                    trabajo2.piso();
                    break;
                    
                    
                 case 3:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio3 trabajo3 = new Ejercicio3();
                    trabajo3.tomaPeso();
                    break;
                    
                 case 4:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio4 trabajo4 = new Ejercicio4();
                    trabajo4.sensor();
                    break;
                    
                 case 5:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio5 trabajo5 = new Ejercicio5();
                    trabajo5.umbral();
                    break;
                    
                 case 6:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio6 trabajo6 = new Ejercicio6();
                    trabajo6.revisionUmbral();
                    break;
                    
                 case 7:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio7 trabajo7 = new Ejercicio7();
                    trabajo7.tienda();
                    break;
                    
                 case 8:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio8 trabajo8 = new Ejercicio8();
                    trabajo8.asistente();
                    break;
                    
                 case 9:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio9 trabajo9 = new Ejercicio9();
                    trabajo9.comprobarEdades();
                    trabajo9.asignaPelicula ();
                    break;
                    
                 case 10:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio10 trabajo10 = new Ejercicio10();
                    trabajo10.decicion();
                    break;
                    
                 case 11:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio11 trabajo11 = new Ejercicio11();
                    trabajo11.menu();
                    break;
                    
                 case 12:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio12 trabajo12 = new Ejercicio12();
                    trabajo12.viaje();
                    break;
                    
                 case 13:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio13 trabajo13 = new Ejercicio13();
                    trabajo13.compras();
                    break;
                    
                 case 14:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio14 trabajo14 = new Ejercicio14();
                    trabajo14.impresora();
                    break;
                    
                 case 15:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio15 trabajo15 = new Ejercicio15();
                    trabajo15.viaje();
                    break;
                    
                 case 16:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio16 trabajo16 = new Ejercicio16();
                    trabajo16.cuentaRegresiva();
                    trabajo16.contar();
                    break;
                    
                  case 17:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio17 trabajo17 = new Ejercicio17();
                    trabajo17.juego();
                    break;
                    
                  case 18:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio18 trabajo18 = new Ejercicio18();
                    trabajo18.biblioteca();
                    break;
                    
                  case 19:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio19 trabajo19 = new Ejercicio19();
                    trabajo19.comida();
                    break;
                    
                  case 20:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio20 trabajo20 = new Ejercicio20();
                    trabajo20.sensor();
                    break;
                    
                  case 21:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio21 trabajo21 = new Ejercicio21();
                    trabajo21.examenes();
                    break;
                    
                  case 22:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio22 trabajo22 = new Ejercicio22();
                    trabajo22.tareas();
                    break;
                    
                    
                  case 23:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio23 trabajo23 = new Ejercicio23();
                    trabajo23.tomaProdutos();
                    break;
                    
                  case 24:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio24 trabajo24 = new Ejercicio24();
                    trabajo24.registroVehiculos();
                    break;
                    
                  case 25:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio25 trabajo25 = new Ejercicio25();
                    trabajo25.comprarProductos();
                    break;
                    
                  case 26:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio26 trabajo26 = new Ejercicio26();
                    trabajo26.libretaContactos();
                    break;
                    
                  case 27:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio27 trabajo27 = new Ejercicio27();
                    trabajo27.numeros();
                    break;
                    
                  case 28:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio28 trabajo28 = new Ejercicio28();
                    trabajo28.registrarVentas();
                    break;
                   
                   
                   
                   
                   
                    
                    
                    
                
                
            }
        }while(opcion>0);
    }
    
}
