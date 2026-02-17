import java.util.Scanner;
public class DiasMes22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del mes (1-12):");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("el mes tiene 31 días.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("el mes tiene 30 días.");
                break;
            case 2:
                System.out.println("el mes tiene 28 o 29 días, dependiendo si es un año bisiesto.");
                break;
            default:
                System.out.println("numero de mes inválido. Por favor ingrese un número entre 1 y 12.");
        }
    }
}
