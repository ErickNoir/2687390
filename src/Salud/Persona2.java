package Salud;
import java.util.Scanner;
public class Persona2 {
    public String typeID, name, lastName, genre, id;
    public int age;
    public double weight, height, iMC;

    Scanner read = new Scanner(System.in);

    public void pedirDatos(){

        System.out.println("Ingrese su tipo de documento:");
        typeID = read.nextLine();

        System.out.println("Ingrese su documento:");
        id = read.nextLine();

        System.out.println("Ingrese su nombre y posteriormente su apellido:");
        name = read.nextLine();
        lastName = read.nextLine();

        System.out.println("Ingrese su edad:");
        age = read.nextInt();

        System.out.println("Ingrese su género:");
        genre = read.nextLine();

        System.out.println("Ingrese su peso (kg) y posteriormente su altura (m)(Utilice una ',' para marcar el decimal):");
        weight = read.nextDouble();
        height = read.nextDouble();
}

    public void mostrarPersona(){
        System.out.println("");
        System.out.println("Sus datos son los siguientes:");
        System.out.println("Indentificación: " + typeID + "" + id);
        System.out.println("Nombre: " + name + ": " + lastName);
        System.out.println("Edad: " + age);
        System.out.println("Género: " + genre);
        System.out.println("Peso: " + weight);
        System.out.println("Altura: " + height);
    }

    public double calcularIMC(){
        iMC = (weight / (height*height));
        return iMC;
    }

    public double gtIMC(){
        return iMC;
    }

    public void mayorEdad(){
        System.out.println("");

        if(age>=18){
            System.out.println("Usted es mayor de edad.");
        }

        else {
            System.out.println("Usted es menor de edad.");
        }


        read.close();
    }
}

