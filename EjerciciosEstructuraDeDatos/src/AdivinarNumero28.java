import java.util.Scanner;
import java.util.Random;
public class AdivinarNumero28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1; // numero aleatorio entre 1 y 100
        int intentos = 0;
        int numeroUsuario = 0;
        int maximoIntentos = 10;

        System.out.println("Bienvenido al juego de adivinar el numero, estoy pensando un numero del 1 al 100. Tienes "
         + maximoIntentos + " intentos para adivinarlo."); 

         for (int i = 0; i < maximoIntentos; i++) {
            System.out.println("Intento " + (i + 1) + ": ingresa tu número:");
            numeroUsuario = sc.nextInt();
            intentos++;

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades, haz adivinado el numero en " + intentos + " intentos");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es mayor que " + numeroUsuario);
            } else {
                System.out.println("El numero secreto es menor que " + numeroUsuario);
            }
        }
    }
}
