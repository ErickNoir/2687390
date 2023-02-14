import java.util.Scanner;

public class Número {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
            int num;

            System.out.println("Ingrese un número:");
                num = read.nextInt();


    if(num>0) {
            System.out.println("El número es positivo.");
        }
        else if(num==0){
            System.out.println("El número es neutro.");
        }
        else {
            System.out.println("El número es negativo.");
            }

            read.close();
}
}