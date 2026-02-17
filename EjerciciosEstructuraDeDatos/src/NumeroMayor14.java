import java.util.Scanner;
public class NumeroMayor14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es el primer número: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es el segundo número: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
