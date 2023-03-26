package Principal;

import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
    Persona sujeto1 = new Persona();
    sujeto1.pedirDatos();
    sujeto1.mostrarPersona();
    sujeto1.calcularIMC();
    sujeto1.mayorEdad();

    }
}

