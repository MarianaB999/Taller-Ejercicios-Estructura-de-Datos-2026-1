import java.util.Scanner;
public class MayorMenor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer número:");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                System.out.println("El orden es: " + numero1 + " , " + numero2 + " , " + numero3);
            } else {
                System.out.println("El orden es: " + numero1 + " , " + numero3 + " , " + numero2);
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println("El orden es: " + numero2 + " , " + numero1 + " , " + numero3);
            } else {
                System.out.println("El orden es: " + numero2 + " , " + numero3 + " , " + numero1);
            }
        } else {
            if (numero1 > numero2) {
                System.out.println("El orden es: " + numero3 + " , " + numero1 + " , " + numero2);
            } else {
                System.out.println("El orden es: " + numero3 + " , " + numero2 + " , " + numero1);
            }
        }
    }
}
