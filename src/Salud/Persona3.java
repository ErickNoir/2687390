package Salud;
import java.util.Scanner;
public class Persona3 {

    private String typeID, name, lastName, id;

    Scanner read = new Scanner(System.in);

    public Persona3(){}
    public Persona3(String typeID, String id, String name, String lastName){
        this.typeID = typeID;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(){
        System.out.println("Ingrese su nombre y posteriormente su apellido:");
        name = read.nextLine();
        lastName = read.nextLine();
    }

    public void setTypeID(){
        System.out.println("Ingrese su tipo de documento:");
        typeID = read.nextLine();
    }

    public void setId(){
        System.out.println("Ingrese su documento:");
        id = read.nextLine();
    }


    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getTypeID(){
        return typeID;
    }
    public String getId(){
        return id;
    }
}
