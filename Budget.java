import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int width, length, area, budget;
        System.out.println("Ingrese en metros el ancho de la superficie, posteriormente ingrese el largo");
            width = lectura.nextInt();
            length = lectura.nextInt();
            area = width * length;
            budget = area * 45000;
        System.out.println("La superficie a cubrir es tiene " + width + " metros de ancho, por " + length + " metros de largo; que en total sería " + area + "m2." + " El presupuesto destinado al proyecto será de: $" + budget);



        
        lectura.close();
}

}