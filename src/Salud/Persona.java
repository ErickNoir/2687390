package Salud;
import java.util.Scanner;
public class Persona {
    public String typeID, name, lastName, genre, id;
    public int age;
    public double weight, height, calc1, iMC;

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

    public void calcularIMC(){
        System.out.println("");

        iMC = Math.pow(height, 2);
        calc1 = (weight / iMC);

        System.out.println("Su IMC es de: " + calc1);

        if(iMC<20){
            System.out.println("El peso está por debajo de lo ideal.");
        }

        else if(calc1>=20 && calc1<=25){
            System.out.println("El peso es ideal.");
        }

        else if(calc1>25){
            System.out.println("Usted tiene sobrepeso.");
        }
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

