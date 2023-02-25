import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); 
            int age;
            double weight, dose;

        System.out.println("Aviso: este cálculo de dosis es solo para bebés menores a un año.");
        System.out.println("Ingrese los meses de edad del bebé: ");
        age = lectura.nextInt();

        System.out.println("Ingrese el peso del bebé en kg: ");
        weight = lectura.nextInt();

        dose = ((weight + 10) / (age * 10)) * 8;
        System.out.println("La dosis de la vacuna a aplicar debe ser de: " + dose + "ml");



        
        lectura.close();
}
}
