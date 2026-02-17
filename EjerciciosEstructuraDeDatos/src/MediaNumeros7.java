import java.util.Scanner;
public class MediaNumeros7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero 1: ");
        float numero1 = sc.nextFloat();
        System.out.println("ingrese el numero 2: ");
        float numero2 = sc.nextFloat();
        System.out.println("ingrese el numero 3: ");
        float numero3 = sc.nextFloat();

        float media = (numero1 + numero2 + numero3)/3;
        System.out.println("la media de los 3 numeros es: " + media);
        }
}
