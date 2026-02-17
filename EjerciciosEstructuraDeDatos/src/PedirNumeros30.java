import java.util.Scanner;
public class PedirNumeros30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNumeros = 0;
        int numero = 0;
        int i = 1;
        int numeroMayor0= 0;
        int numeroMenor0= 0;
        int numeroIgual0= 0;
        System.out.println("cuantos numeros deseas ingresar?: ");
        cantidadNumeros = sc.nextInt();

        while (i <= cantidadNumeros) {
            System.out.println("ingresa el numero: " + i + ": ");
            numero = sc.nextInt();
            if (numero > 0) {
                numeroMayor0++;
            } else if (numero < 0) {
                numeroMenor0++;
            } else {
                numeroIgual0++;
            }   
            i++;
        }
        System.out.println("numeros mayores a 0: " + numeroMayor0);
        System.out.println("numeros menores a 0: " + numeroMenor0);
        System.out.println("numeros iguales a 0: " + numeroIgual0);
    }
}
