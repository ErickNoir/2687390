package Polimorfismo;
import java.util.Scanner;

public class Ejecucion{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option;

        Rectangulo rec1 = new Rectangulo();
        Cuadrado cua1 = new Cuadrado();
        Triangulo tria1 = new Triangulo();
        Circulo circ1 = new Circulo();

        System.out.println("¿Qué figura desea calcular? (1)Rectangulo, (2)Cuadrado, (3)Triangulo, (4)Circulo");
        option = read.nextInt();

        if(option==1){
            rec1.setSideOne(0);
            rec1.setSideTwo(0);
            rec1.calcularArea();
        }

        else if(option==2){
            cua1.setLado(0);
            cua1.calcularArea();
        }

        else if(option==3){
            tria1.setBase(0);
            tria1.setHeight(0);
            tria1.calcularArea();
        }

        else if(option==4){
            circ1.setDiameter(0);
            circ1.calcularArea();
        }

        else {
            System.out.println("Opción no válida. Intente nuevamente.");
        }

    }
}
