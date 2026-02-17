import java.util.Scanner;
public class SueldoEmpleados34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de empleados:");
        int numeroEmpleados = sc.nextInt();
        System.out.println("Ingrese el valor de la hora trabajada:");
        double valorHora = sc.nextDouble();
        double sueldoTotal = 0;
        
        for (int i = 1; i <= numeroEmpleados; i++) {
            System.out.println("Ingrese el número de horas trabajadas por el empleado " + i + ":");
            int horasTrabajadas = sc.nextInt();
            double sueldoEmpleado = horasTrabajadas * valorHora;
            sueldoTotal += sueldoEmpleado;
            System.out.println("El sueldo del empleado " + i + " es: " + sueldoEmpleado);
        }

        System.out.println("El sueldo total a pagar a los " + numeroEmpleados + " empleados es: " + sueldoTotal);
    }
}
