package Polimorfismo;
import java.util.Scanner;

public class PPT implements Juego{
    Scanner read = new Scanner(System.in);
    private int rolSistem, rolPlayer;
    private String name; 

    @Override
    public void iniciar() {
        System.out.println("Ingrese su nombre de juegador:");
        name = read.nextLine();
    }

    @Override
    public void jugar() {
        rolSistem = (int)(Math.random()*3+1);
        System.out.println(name + ", elija su rol: (1)Piedra, (2)Papel o (3)Tijeras.");
        rolPlayer = read.nextInt();
    }

    @Override
    public void finalizar() {
        if(rolSistem==rolPlayer) {
            System.out.println(name + " Empate. El sistema eligió el mismo rol.");
        }

    //Player Lose
        
        else if (rolSistem==3 && rolPlayer==2){
            System.out.println(name + " Perdió. El sistema eligió 'Tijeras'.");
        }

        else if (rolSistem==2 && rolPlayer==1){
            System.out.println(name + " Perdió. El sistema eligió 'Papel'.");
        }

        else if (rolSistem==1 && rolPlayer==3){
            System.out.println(name + " Perdió. El sistema eligió 'Piedra'.");
        }

    //Player Win

        else if (rolSistem==1 && rolPlayer==2){
            System.out.println(name + " Ganó. El sistema eligió 'Piedra'.");
        }

        else if (rolSistem==2 && rolPlayer==3){
            System.out.println(name + " Ganó. El sistema eligió 'Papel'.");
        }

        else if (rolSistem==3 && rolPlayer==1){
            System.out.println(name + " Ganó. El sistema eligió 'Tijera'.");
        }

    //Invalid number

        else {
            System.out.println(name + " Algo salió mal. Seguramente escribió una opcion no valida. Intente nuevamente.");
            }
    }

}