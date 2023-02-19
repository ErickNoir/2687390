import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        int rolSistem, rolPlayer; 
        rolSistem = (int)(Math.random()*3+1);

            System.out.println("Elija su rol: (1)Piedra, (2)Papel o (3)Tijeras.");
            rolPlayer = read.nextInt();
            
            if(rolSistem==rolPlayer) {
                System.out.println("Empate. El sistema eligió el mismo rol.");
            }

        //Player Lose
            
            else if (rolSistem==3 && rolPlayer==2){
                System.out.println("Perdió. El sistema eligió 'Tijeras'.");
            }

            else if (rolSistem==2 && rolPlayer==1){
                System.out.println("Perdió. El sistema eligió 'Papel'.");
            }

            else if (rolSistem==1 && rolPlayer==3){
                System.out.println("Perdió. El sistema eligió 'Piedra'.");
            }

        //Player Win

            else if (rolSistem==1 && rolPlayer==2){
                System.out.println("Ganó. El sistema eligió 'Piedra'.");
            }

            else if (rolSistem==2 && rolPlayer==3){
                System.out.println("Ganó. El sistema eligió 'Papel'.");
            }

            else if (rolSistem==3 && rolPlayer==1){
                System.out.println("Ganó. El sistema eligió 'Tijera'.");
            }

        //Invalid number

            else {
                System.out.println("Algo salió mal. Seguramente escribió una opcion no valida. Intente nuevamente.");
                }
            
        read.close();
    }
}
