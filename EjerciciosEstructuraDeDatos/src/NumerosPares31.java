import java.util.Scanner;
public class NumerosPares31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        int numeroInicio = sc.nextInt();
        System.out.println("ingrese el segund numero:");
        int numeroFin = sc.nextInt();

        if (numeroInicio > numeroFin){
            int variableTemporal = numeroInicio;
            numeroInicio = numeroFin;
            numeroFin = variableTemporal;
        }

        System.out.println("los numeros pares entre " + numeroInicio + " y " + numeroFin + " son:");

        for (int i = numeroInicio; i <= numeroFin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
