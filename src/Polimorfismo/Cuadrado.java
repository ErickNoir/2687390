package Polimorfismo;
import java.util.Scanner;

public class Cuadrado extends Figura{
    private float side;
    Scanner read = new Scanner(System.in);

    //metodos accesorios get y set
    public float getLado(){
        return side;
    }

    public void setLado(float side){
        System.out.println("Ingrese la medida de uno de los lados de la figura:");
        side=read.nextFloat();
        this.side=side;
    }

    @Override
    public void calcularArea() {
        //area del cuadrado
        float area=side*side;
        System.out.println("La medida de cada lado del cuadrado es  de " + side + " el area es de " + area);
    }

}