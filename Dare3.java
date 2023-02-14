import java.util.Scanner;

public class Dare3 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
            int side, cSide; 
            side = (int)(Math.random()*2+1);

        System.out.println("Elija un número correspondiente a la (1)'Cara', o el (2)'Sello' de la moneda:");
                cSide = read.nextInt();


    if(cSide==side) {
        System.out.println("Ganó.");
    }

    else {
        System.out.println("Perdió.");
        }

            read.close();
}

}
