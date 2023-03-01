import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int temp1, temp2;
        System.out.println("Ingrese la temperatura Farenheit que desea convertir a Celcius: ");
        temp1 = lectura.nextInt();
        temp2 = (temp1 - 32) * 5/9;
        System.out.println(temp1 + "°F son " + temp2 + "°C");



        
        lectura.close();
}

}