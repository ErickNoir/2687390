package Polimorfismo;
import java.util.Scanner;

public class Circulo extends Figura{
    float diameter;
    Scanner read = new Scanner(System.in);

    public float getDiameter(){
        return diameter;
    }

    public void setDiameter(float diameter){
        System.out.println("Ingrese el diametro de la figura:");
        diameter=read.nextFloat();
        this.diameter=diameter;
    }

    
    @Override
    public void calcularArea() {
        //area del triangulo
        float radius=diameter/2;
        double area= 3.1416 * (radius*radius);
        System.out.println("El diametro del circulo es de " + diameter + ", su radio es de " + radius + ", y el area es de " + area);
    }
}
