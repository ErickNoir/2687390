import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);

    String name, lastName;

        System.out.println("ingrese su nombre:");
        name = read.nextLine();

        System.out.println("ingrese su apellido:");
        lastName = read.nextLine();
        
        int nameLength= name.length();
        int lastNameLength= lastName.length();

        String sSubName = name.substring(0,2);
        String allName = name + lastName;

        System.out.println("Su  nombre completo es: " + allName);
<<<<<<< HEAD

=======
>>>>>>> c8778460c1fe1b3c3bbfa4569ef447de6cac950c

        System.out.println("Su  nombre contiene: " + nameLength + " caracteres. Mientras que su apellido contiene: " + lastNameLength + " caracteres.");

        System.out.println("Su dirección de correo electerónico será el siguiente: " + sSubName.toLowerCase() + lastName.toLowerCase() + "@gmail.com");

        read.close();
}

}
