package Polimorfismo;
import java.util.Scanner;

public class CaraSello implements Juego{
    Scanner read = new Scanner(System.in);
    private String nombre;
    private int eleccion, lanzamiento;

    @Override
    public void iniciar() {
       System.out.println("Ingrese el nombere del jugador:");
       nombre = read.nextLine();
    }

    @Override
    public void jugar() {
        lanzamiento=(int)(Math.random()*1+2);
        System.out.println(nombre + "Seleccione (1)Cara, (2)Sello");
        eleccion = read.nextInt();
    }

    @Override
    public void finalizar() {
        if(lanzamiento==eleccion){
            System.out.println("Ganó.");
        }

        else{
            System.out.println("Perdió.");
        }
    }
    
}
