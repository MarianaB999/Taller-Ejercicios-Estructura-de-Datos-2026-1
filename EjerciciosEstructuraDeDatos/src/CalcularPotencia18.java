import java.util.Scanner;
public class CalcularPotencia18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente:");
        int exponente = sc.nextInt();

        if (exponente > 0) {
            float resultado = (float) Math.pow(base, exponente);
            System.out.println("El resultado es: " + resultado);
        } else if (exponente == 0) {
            float resultado = 1;
            System.out.println("El resultado es: " + resultado);
        } else {
            float resultado = 1 /(float) Math.pow(base, -exponente);
            System.out.println("El resultado es: " + resultado);
        }
    }
}
