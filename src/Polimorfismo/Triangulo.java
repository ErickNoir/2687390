package Polimorfismo;
import java.util.Scanner;

public class Triangulo extends Figura{
    Scanner read = new Scanner(System.in);
    
    float base, height;

    public float getBase(){
        return base;
    }

    public void setBase(float base){
        System.out.println("Ingrese la base de la figura:");
        base=read.nextFloat();
        this.base=base;
    }

    public float getHeight(){
        return base;
    }

    public void setHeight(float height){
        System.out.println("Ingrese el alto de la figura:");
        height=read.nextFloat();
        this.height=height;
    }
    
    @Override
    public void calcularArea() {
        //area del triangulo
        float area=base*height;
        System.out.println("El alto del triangulo " + height + ", la base es " + base + ", el area es de " + area);
    }
}
