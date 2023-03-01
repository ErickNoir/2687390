import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);
        int price, finalPrice = 0, op, ticket, sale = 0, pay, change, participate;
        ticket=(int)(Math.random()*10+1) ;

        
        do{
            System.out.println("Ingrese el precio del producto:");
            price = read.nextInt();
            finalPrice = finalPrice + price;

            System.out.println("¿Desea agregar otro registro de precio? (1)Sí (2)No");
            op = read.nextInt();

            if (op!=1){
                break;
            }
            }while(op==1);

        if (finalPrice>=50000){
            participate = 1;
            switch (ticket){
                case 1:
                    sale = finalPrice - ((finalPrice * 10) / 100);
                    System.out.println("Salió un bolita roja, su compra tiene un descuento del 10%. El valor total será: $" + sale);
                break;

                case 2, 3, 4:
                    sale = finalPrice - ((finalPrice * 30) / 100);
                    System.out.println("Salió un bolita azul, su compra tiene un descuento del 30%. El valor total será: $" + sale);
                break;

                case 5, 6, 7, 8, 9:
                    sale = finalPrice - ((finalPrice * 50) / 100);
                    System.out.println("Salió un bolita amarilla, su compra tiene un descuento del 50%. El valor total será: $" + sale);
                break;

                case 10:
                    System.out.println("Salió una blita blanca. Felicidades, su compra es gratis!");
                    participate = 3;
                break;

            }
        }

        else {
            participate = 2;
            System.out.println("El precio final de la compra no es siuficiente para participar. Deben ser $50,000 como mínimo.");
        }

        
        System.out.println("Ingrese el valor con el que pagará:");
        pay = read.nextInt();

        if(participate==1){
            change = pay - sale;
            System.out.println("Su cambio es de: $" + change);
            System.out.println("Gracias por su compra, vuelva pronto!");
        }
        else if(participate==2){
            change = pay - finalPrice;
            System.out.println("Su cambio es de: $" + change);
            System.out.println("Gracias por su compra, vuelva pronto!");
        }

        else {
            System.out.println("Gracias por preferirnos, vuelva pronto!");
        }
 
    read.close();
}
}