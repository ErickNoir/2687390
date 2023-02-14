import java.util.Scanner;

public class Sumar_restar {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
            int num1, num2, num3;

            System.out.println("Ingrese un número:");
                num1 = read.nextInt();
            System.out.println("Ingrese un número:");
                num2 = read.nextInt();


    if(num1>num2) {
        num3= num1 + num2;
            System.out.println("Dado que este programa evalua el tamaño de ambos números, el primer número ingresado al ser mayor, se le sumará el segundo número ingresado. El resultado es: " + num3);
        }

        else {
            num3= num2 - num1;
            System.out.println("Dado que este programa evalua el tamaño de ambos números, el segundo número ingresado al ser mayor, se le restará el primer número ingresado. El resultado es: " + num3);
            }

            read.close();
}
}