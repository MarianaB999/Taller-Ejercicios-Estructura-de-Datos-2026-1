import java.util.Scanner;
public class NumerosSumaMedia29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        double media = 0;
        int i = 0;

        System.out.println("ingresa el primer numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.println("Ingrese el siguiente numero: " );
            numero = sc.nextInt();
            i++;
        }
        media = (double) suma / i;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }
}
