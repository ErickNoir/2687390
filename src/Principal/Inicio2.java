package Principal;
import java.util.Scanner;
import Salud.Persona2;
public class Inicio2 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Persona2 sujeto1 = new Persona2(); 

    sujeto1.pedirDatos();
    sujeto1.mostrarPersona();
    sujeto1.calcularIMC();

        System.out.println("Su IMC es de: " + sujeto1.gtIMC());

        if(sujeto1.gtIMC()<20){
         System.out.println("PESOBAJO.");
        }

        else if(sujeto1.gtIMC()>=20 && sujeto1.gtIMC()<=25){
            System.out.println("PESOIDEAL.");
        }

        else if(sujeto1.gtIMC()>25){
            System.out.println("SOBREPESO");
        }
        

    sujeto1.mayorEdad();

    read.close();
    }
}