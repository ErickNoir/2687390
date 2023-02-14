import java.util.Scanner;

public class Club {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

            int age;

            System.out.println("Ingrese su edad:");
                age = read.nextInt();
    if(age>=18) {
            System.out.println("Bienvenido, puede pasar.");
        }

        else {
            System.out.println("Aún no cuenta con la edad suficiente para poder pasar.");
            }

            read.close();
}
}