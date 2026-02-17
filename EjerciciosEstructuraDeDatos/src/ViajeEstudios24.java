import java.util.Scanner;
public class ViajeEstudios24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes:");
        int numeroEstudiantes = sc.nextInt();

        if (numeroEstudiantes >= 100) {
            System.out.println("El costo por estudiante es de $65");
            double costoBus = 65 *numeroEstudiantes;
            System.out.println("El pago a la compañia de bus es de: " + costoBus);
        } else if (numeroEstudiantes >= 50) {
            System.out.println("El costo por estudiante es de $70");
            double costoBus = 70 *numeroEstudiantes;
            System.out.println("El pago a la compañia de bus es de: " + costoBus);
        } else if (numeroEstudiantes >= 30) {
            System.out.println("El costo por estudiante es de $95");
            double costoBus = 95 *numeroEstudiantes;
            System.out.println("El pago a la compañia de bus es de: " + costoBus);
        } else {
            double costoPorEstudiante = 4000.0 / numeroEstudiantes;
            System.out.println("El costo por estudiante es de $" + costoPorEstudiante);
            System.out.println("El pago a la compañia de bus es de: $4000");
        }
    }
}
