import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int nProduct, totalPay, pay, change;
        System.out.println("Ingrese la cantidad de productos comprados: ");
            nProduct = lectura.nextInt();
            totalPay = nProduct * 10000;
        System.out.println("El total a pagar es de $" + totalPay);
        System.out.println("Ingrese la cantidad de dinero con el que paga: ");
            pay = lectura.nextInt();
            change = pay - totalPay;
        System.out.println("Su cambio será de $" + change);



        
        lectura.close();
}

}