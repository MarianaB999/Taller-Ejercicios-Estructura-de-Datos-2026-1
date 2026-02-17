import java.util.Scanner;
public class CalificacionFinal10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la  primer calificacion parcial: ");
        float calificacionParcial1 = sc.nextFloat();
        System.out.println("ingresa la segunda calificacion parcial: ");
        float calificacionParcial2 = sc.nextFloat();
        System.out.println("ingresa la tercer calificacion parcial: ");
        float calificacionParcial3 = sc.nextFloat();
        System.out.println("ingresa la calificacion del examen final: ");
        float calificacionExamenFinal = sc.nextFloat();
        System.out.println("ingresa la calificacion del trabajo final: ");
        float calificacionTrabajoFinal = sc.nextFloat();

        float promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3;
        float calificacionFinal = (promedioParciales * 0.55f) + (calificacionExamenFinal * 0.30f) + (calificacionTrabajoFinal * 0.15f);
        System.out.println("la calificacion final del estudiante es: " + calificacionFinal);
        
    }
}
