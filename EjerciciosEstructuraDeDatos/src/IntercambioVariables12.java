import java.util.Scanner;
public class IntercambioVariables12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de la variable A: ");
        int variableA = sc.nextInt();
        System.out.println("ingrese el numero de la variable B: ");
        int variableB = sc.nextInt();

        int temporal = variableA;
        variableA = variableB;
        variableB = temporal;

        System.out.println("antes del intercambio:");
        System.out.println("variable A: " + temporal);
        System.out.println("variable B: " + variableA);
        System.out.println("despues del intercambio:");
        System.out.println("variable A: " + variableA);
        System.out.println("variable B: " + variableB);
    }
}

