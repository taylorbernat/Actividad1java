
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio23 {
    public Ejercicio23(){
    
    }
    
    public int camisa(int cantd){
        int camisa=45000*cantd;
        return camisa;
    }
    public int pantalon(int cantd){
        int pantalon=11200*cantd;
        return pantalon;
    }
    public int sudadera(int cantd){
        int sudadera=43200*cantd;
        return sudadera;
    }
    public int gorra(int cantd){
        int gorra=55000*cantd;
        return gorra;
    }
    public int pantaloneta(int cantd){
        int pantaloneta=60000*cantd;
        return pantaloneta;
    }
    
    public void  tomaProdutos(){
        int cantCamisa =0;
        int cantPantalon =0;
        int cantSudadera =0;
        int cantGorra =0;
        int cantPantaloneta =0;
        int control=0;
        do{
            System.out.println("Que produsto desea llevar");
            System.out.println("1.Camisa = $45000");
            System.out.println("2.Pantaon jean = $11200");
            System.out.println("3.Sudadera = $43200");
            System.out.println("4.Gorra = $55000");
            System.out.println("5.Pantaloneta = $60000");
            System.out.println("0.Terminar compra");
            Scanner respuesta = new Scanner(System.in);
            int eleccion = respuesta.nextInt();
            switch(eleccion){
                case 0:
                    System.out.println("Gracias por su compra");
                    control=1;
                    break;
                case 1:
                    cantCamisa =cantCamisa+1;
                    break;
                case 2:
                    cantPantalon =cantPantalon+1;
                    break;

                case 3:
                    cantSudadera =cantSudadera+1;
                    break;

                case 4:
                    cantGorra =cantGorra+1;
                    break;
                case 5:
                    cantPantaloneta =cantPantaloneta+1;
                    break;
                default:
                    System.out.println("Error digito incorrecto");
            }
            
        }while(control==0);
        int precioCamisas=camisa(cantCamisa);
        int precioPantalon=pantalon(cantPantalon);
        int precioSudadera=sudadera(cantSudadera);
        int precioGorra=gorra(cantGorra);
        int precioPantaloneta=pantaloneta(cantPantaloneta);
        int total=precioCamisas+precioPantalon+precioSudadera+precioGorra+precioPantaloneta;
        System.out.println("Que produsto desea llevar");
        System.out.println("1.Camisa Cantidad= "+cantCamisa+" Precio total= "+precioCamisas );
        System.out.println("2.Pantaon jean Cantidad= "+cantPantalon+" Precio total= "+precioPantalon);
        System.out.println("3.Sudadera Cantidad= "+cantSudadera+" Precio total= "+precioSudadera);
        System.out.println("4.Gorra Cantidad= "+cantGorra+" Precio total= "+precioGorra);
        System.out.println("5.Pantaloneta Cantidad= "+cantPantaloneta+" Precio total= "+precioPantaloneta);
        System.out.println("EL TOTAL A PAGAR POR SUS PRODUCTOS ES : -----------$"+total+"-----------");


    }
}
