import java.util.Scanner;

public class Reto7 {
    
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);
        int price, ticket, sale;
        ticket=(int)(Math.random()*10+1) ;

        System.out.println("Ingrese el precio final de la compra:");
        price = read.nextInt();

        if (price==50000){
            switch (ticket){
                case 1:
                    sale = price - ((price * 10) / 100);
                    System.out.println("Salió un bolita roja, su compra tiene un descuento del 10%. El valor total será: $" + sale);
                break;

                case 2, 3, 4:
                    sale = price - ((price * 30) / 100);
                    System.out.println("Salió un bolita azul, su compra tiene un descuento del 30%. El valor total será: $" + sale);
                break;

                case 5, 6, 7, 8, 9:
                    sale = price - ((price * 50) / 100);
                    System.out.println("Salió un bolita amarilla, su compra tiene un descuento del 50%. El valor total será: $" + sale);
                break;

                case 10:
                    System.out.println("Salió una blita blanca. Felicidades, su compra es gratis!");
                break;

            }
        }

        else {
            System.out.println("El preci final de la compra no es siuficiente para participar. Deben ser $50,000 como mínimo.");
        }

    read.close();
}

}
