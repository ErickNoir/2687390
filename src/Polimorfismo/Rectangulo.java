package Polimorfismo;
import java.util.Scanner;

public class Rectangulo extends Figura{
    private float sideOne, sideTwo;
    Scanner read = new Scanner(System.in);

    //metodos accesorios get y set
    public float getSideOne(){
        return sideOne;
    }

    public void setSideOne(float sideOne){
        System.out.println("Ingrese el ancho de la figura:");
        sideOne=read.nextFloat();
        this.sideOne=sideOne;
    }

    public float getSideTwo(){
        return sideTwo;
    }

    public void setSideTwo(float sideTwo){
        System.out.println("Ingrese el alto de la figura:");
        sideTwo=read.nextFloat();
        this.sideTwo=sideTwo;
    }

    @Override
    public void calcularArea() {
        //area del cuadrado
        float area=sideOne*sideTwo;
        System.out.println("La medida del ancho es de " + sideOne + ", la medida del largo es de " + sideTwo + ", el area es de " + area);
}
}
