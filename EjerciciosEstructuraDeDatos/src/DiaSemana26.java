import java.util.Scanner;
public class DiaSemana26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de la semana del 1 al 7:");
        int numeroDia = sc.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("El día de la semana es Lunes");
                break;
            case 2:
                System.out.println("El día de la semana es Martes");
                break;
            case 3:
                System.out.println("El día de la semana es Miércoles");
                break;
            case 4:
                System.out.println("El día de la semana es Jueves");
                break;
            case 5:
                System.out.println("El día de la semana es Viernes");
                break;
            case 6:
                System.out.println("El día de la semana es Sábado");
                break;
            case 7:
                System.out.println("El día de la semana es Domingo");
                break;
            default:
                System.out.println("ERROR, por favor ingrese un número del 1 al 7.");
        }
    }
}
