import java.util.Scanner;
public class TipoTriangulo20 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo:");
        int A = sc.nextInt();
        System.out.println("Ingrese el segundo lado del triángulo:");
        int B = sc.nextInt();
        System.out.println("Ingrese el tercer lado del triángulo:");
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println("El triángulo es equilátero");
        } else if (A == B || A == C || B == C) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
   } 
}
