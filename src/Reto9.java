import java.util.Scanner;
public class Reto9 {
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);
    int sistmRol, playerRol, op, defaultMoney, roundMoney, round = 0;
    sistmRol = (int)(Math.random()*2+1);


    System.out.println("Ingrese el valor que desea apostar en todo el juego: ");
    defaultMoney = read.nextInt();

    do{
        System.out.println("Elija su rol: (1)cara (2)sello");
        playerRol = read.nextInt();

        System.out.println("Ingrese el valor que desea apostar en esta ronda: ");
        roundMoney = read.nextInt();

        if(roundMoney>defaultMoney){
            System.out.println("Fondos insuficientes. Intente nuevamente e ingrese un valor menor al total apostado en el juego.");
            round = round +1;
        }

        else if(playerRol>sistmRol){
            defaultMoney = (roundMoney * 2) + defaultMoney;
            System.out.println("Ganó. Se duplicará su presupuesto apostado en esta ronda y será sumado al apostado en todo el juego. Su presupuesto ahora es de: $" + defaultMoney);
            round = round +1;
        }
        
        else if(playerRol==sistmRol){
            System.out.println("Empate. Puede continuar con la siguiente ronda.");
            round = round +1;
        }

        else{
            defaultMoney = defaultMoney - roundMoney;
            System.out.println("Perdió. se le restará el valor apostado al presupuesto apostado en todo el juego. Su presupuesto ahora es de: $" + defaultMoney);
        }

        System.out.println("¿Desea jugar una ronda más? (1)Sí (2)No");
        op = read.nextInt();

        if (op!=1){
            break;
        }

        if(defaultMoney<=0){
            System.out.println("Fondos totales insuficientes. Tiene una deuda de: $" + defaultMoney);
            op = 2;
        }

    }while(op==1);

    System.out.println("Su dinero total ahora es de: $" + defaultMoney);
    System.out.println("jugó un total de " + round + " rondas.");
    System.out.println("Gracias por jugar!");

    read.close(); 
    }
}

