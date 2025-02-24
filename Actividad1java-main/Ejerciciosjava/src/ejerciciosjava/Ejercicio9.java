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
public class Ejercicio9 {
   public Ejercicio9(){
    
}
 public String comprobarEdades(){
        System.out.println("Escriba la edad de la persona");
        Scanner respuesta = new Scanner(System.in);
        int edad = respuesta.nextInt();
        if(edad>0 && edad<=7){
            String edadPersona = "niño";
            return edadPersona;
        }else if(edad>7 && edad<=17){
            String edadPersona = "adolecente";
            return edadPersona;

        }else if(edad>17 && edad<=30){
            String edadPersona = "Adulto";
            return edadPersona;

        }else if(edad>30){
            String edadPersona = "adulto mayor";
            return edadPersona;

        }else{
            return null;
        }
            
    }
    public void asignaPelicula(){
        String edad=comprobarEdades();
        switch(edad){
            case "niño":
                System.out.println("-Peliculas animadas\n-Peliculas educativas\n-Peliculas de aventuras suaves\n-Peliculas de fantasia");
                break;
            case "adolecente":
                System.out.println("-Animaciones (como Frozen, Toy Story)\n-Aventura (como Harry Potter, Percy Jackson)\n-Comedias familiares (como Mi villano favorito, Madagascar)\n-Ciencia ficcion (como Los Increibles, Spider-Man: Un Nuevo Universo)\n-Peliculas de superheroes (como Los Vengadores)");
                break;
            case  "Adulto":
                System.out.println("-Accion (como Mad Max: Fury Road, John Wick)\n-Drama (como La La Land, El Club de la Pelea)\n-Comedia (como Superbad, The Hangover)\n-Ciencia ficcion (como Interstellar, Blade Runner 2049)\n-Suspenso (como Inception, Shutter Island)\n-Thriller (como The Dark Knight, Gone Girl)");
                break;
            case "adulto mayor":
                System.out.println("-Peliculas clasicas (como Casablanca, Lo que el viento se llevo)\n-Dramas (como El Padrino, Forrest Gump)\n-Comedias romanticas clasicas (como Desayuno en Tiffany's, Cuando Harry encontro a Sally)\n-Peliculas historicas (como El discurso del rey, La lista de Schindler)\n-Documentales (como En busca del bienestar, Won't You Be My Neighbor?)");
                break;
            default:
                System.out.println("Lo que escribio esta fuera del rango");
        }   
    }
}
