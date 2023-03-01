public class Reto6 {
    public static void main(String[] args) throws Exception {
        
    System.out.println("Craps. Apuesta a un solo tiro, en este juego se lanzan dis dados, se gana si se obtiene unlanzamiento con:");
    System.out.println("Un par de 1 en los dados.");
    System.out.println("Un total de 3 en los dados.");
    System.out.println("Un total de 11 en los dados.");
    System.out.println("Se obvtiene 2 o 12 en los dados.");
    System.out.println("Un total de 7 en los dados.");
    System.out.println("");

    int cubeOne, cubeTwo, cubesPlus; 
        cubeOne = (int)(Math.random()*6+1);
        cubeTwo = (int)(Math.random()*6+1);
        cubesPlus = cubeOne + cubeTwo;

        if (cubesPlus==2) {
            System.out.println("Ganó. Obtuvo un par en uno de los dados.");
        }

        else if (cubesPlus==3){
            System.out.println("Ganó. Obtuvo un total de 3 en los dados.");
        }

        else if (cubesPlus==11){
            System.out.println("Ganó. Obtuvo un total de 11 en los dados.");
        }

        else if (cubesPlus==12 || cubesPlus==2){
            System.out.println("Ganó. Obtuvo un total de 12 o 2 en los dados.");
        }

        else if (cubesPlus==7){
            System.out.println("Ganó. Obtuvo un total de 7 en los dados.");
        }

        else {
            System.out.println("Perdió. No obtuvo ninguna condición para ganar.");
        }
}
}