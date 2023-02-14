import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
            int numberOne, numberTwo, result;
                System.out.println("Ingrese el número al que quiere adicionar:");
                numberOne = lectura.nextInt();

                System.out.println("Ingrese el número que quiere adicionar");
                numberTwo = lectura.nextInt();

            result = numberOne + numberTwo;
        System.out.println("El resultado es: " + result);

            lectura.nextLine(); // Limpieza del boofer ("cache")
            String name;
            System.out.println("Igrese su nombre: ");
            name = lectura.nextLine();
            System.out.println("El nombre ingresado es: " + name);

        

        lectura.close();
    }
}
